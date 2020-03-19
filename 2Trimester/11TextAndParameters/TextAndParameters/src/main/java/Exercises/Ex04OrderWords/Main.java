
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

class Main {
  public static void main(String[] args) {
    
    //If number of arguments isnt the same as 1
    if (args.length != 1) {
      System.out.println("Incorrect number of arguments, launch it with only 1.");

      //If correct number of args
    } else {

        try {

          //Creates BufferedReader for reading words
          BufferedReader brd = new BufferedReader(new FileReader(args[0]));

          int length = args[0].length();

          //Name of file
          String name = args[0].substring(0, length - 4);
          
          //Extension of file
          String extension = args[0].substring(length - 4, length);
    
          //Creates BufferedWriter for writing words in a new file
          BufferedWriter bwr = new BufferedWriter(new FileWriter(name + "_sort" + extension));
    
          //Created vector instead array because we don't know how many words can be
          Vector<String> v = new Vector<String>();
    
          //Read words
          String line = "";
          while (line != null) {
            v.addElement(line);
            line = brd.readLine();
          }

          brd.close();
    
          v.removeElementAt(0);
          Collections.sort(v);

          //Write words
          for (String s: v) {
            bwr.write(s + "\n");
          }
    
          bwr.close();
        } catch (IOException ioe) {
          System.err.println(ioe.getMessage());
        }



      } 

    






  }
}
