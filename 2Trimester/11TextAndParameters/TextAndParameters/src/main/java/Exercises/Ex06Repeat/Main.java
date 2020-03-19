
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {

  public static void main(String[] args) {

    //If number of arguments isnt the same as 1
    if (args.length != 2) {
      System.out.println("Incorrect number of arguments, launch it with only 2.");

      //If correct number of args
    } else {

        try {

          BufferedReader brd = new BufferedReader(new FileReader(args[0]));

          String word = args[1];
          String line = "";
          int repeat = 0;
          int counter = 0;
          
          
          while ((line = brd.readLine()) != null) {
            
            while ((counter = line.indexOf(word)) != -1) {
              line = line.substring(counter + word.length(), line.length());
              repeat++;
              
            }
          }
          
          brd.close();
          
          System.out.println("The word appears " + repeat + " times.");
    
        } catch (IOException ioe) {
          System.err.println(ioe.getMessage());
        }




    }
        
    
  }
}
