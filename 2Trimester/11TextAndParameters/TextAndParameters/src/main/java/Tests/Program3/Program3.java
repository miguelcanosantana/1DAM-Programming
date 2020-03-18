package Tests.Program3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){
    
    try {
      //Read from document file1.txt
      BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\migue\\Mega\\Git\\1DAM-Programming\\2Trimester\\11TextAndParameters\\TextAndParameters\\src\\main\\java\\Tests\\Program3\\file1.txt"));
      
      //Read from document file2.txt
      BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\migue\\Mega\\Git\\1DAM-Programming\\2Trimester\\11TextAndParameters\\TextAndParameters\\src\\main\\java\\Tests\\Program3\\file2.txt"));

      //Write document to written.txt
      BufferedWriter bwr = new BufferedWriter(new FileWriter("C:\\Users\\migue\\Mega\\Git\\1DAM-Programming\\2Trimester\\11TextAndParameters\\TextAndParameters\\src\\main\\java\\Tests\\Program3\\written.txt"));
      
      String text1 = "";
      String text2 = "";

      //Print lines of text until no more are left, so while ends.
      while ((text1 != null)||(text2 != null)) {
        
        if (text1 != null) {
          System.out.println(text1);
          bwr.write(text1);
          bwr.write("\n");
          text1 = br1.readLine();
          

        }
        if (text2 != null) {
          System.out.println(text2);
          bwr.write(text2);
          bwr.write("\n");
          text2 = br2.readLine();
          
        }
      }
      br1.close();
      br2.close();
      bwr.close();
      

    

      //If file not found print error f (Can give to it any name)
    } catch (FileNotFoundException f) {
      System.out.println("File not found.");
      System.out.println("System error: " + f);

    } catch (IOException io) {
      System.out.println("Couldn't write.");
      System.out.println("System error: " + io);

    }


   
  }
  
}
