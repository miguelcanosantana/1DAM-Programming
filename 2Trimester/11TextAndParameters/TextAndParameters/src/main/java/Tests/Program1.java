package Tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Program1 {
  public static void main(String[] args){
    
    try {
      //Read from document file.txt
      BufferedReader br = new BufferedReader(new FileReader("file.txt"));

      String text = "";

      //Print lines of text until no more are left, so while ends.
      while (text != null) {
        System.out.println(text);
        text = br.readLine();
        }

    br.close();

      //If file not found print error f (Can give to it any name)
    } catch (FileNotFoundException f) {
      System.out.println("File not found.");
      System.out.println("System error: " + f);

    } catch (IOException io) {
      System.out.println("File not found.");
      System.out.println("System error: " + io);

    }

   
  }

}