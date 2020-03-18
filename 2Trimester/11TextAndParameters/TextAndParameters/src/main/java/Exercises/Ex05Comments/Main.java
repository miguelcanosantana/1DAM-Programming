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

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

        String line = "";
        String newLine = "";

        // Is one line comment ?
        boolean oneLineComment = false;
        int i = 0;
        
        while ((line = br.readLine()) != null) {
          
          int l = line.length();
          newLine = line;

          // Sees where is start of comment
          if ((i = line.indexOf("/*")) != -1) {
            oneLineComment = true;
            newLine = line.substring(0, i);
            line = newLine;
          }
          
          // Sees where is final line 
          if ((i = line.indexOf("*/")) != -1) {
            oneLineComment = false;
            newLine = line.substring(i + 2, l);
          }

          // Detecta one line comment
          if (((i = line.indexOf("//")) != -1) && !oneLineComment) {
            newLine = line.substring(0, i);
          }

          if (!oneLineComment) {
            bw.write(newLine + "\n");
          }
        }
        
        br.close();
        bw.close();

      } catch (IOException ioe) {
        System.err.println(ioe.getMessage());
      }

    }
  }
}
