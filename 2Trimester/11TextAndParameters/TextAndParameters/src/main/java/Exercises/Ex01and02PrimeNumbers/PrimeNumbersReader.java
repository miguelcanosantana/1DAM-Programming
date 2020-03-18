package Exercises.Ex01and02PrimeNumbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrimeNumbersReader {
  public static void main(String[] args){
  
    try {
      //Read numbers of document written.txt
      BufferedReader brd = new BufferedReader(new FileReader("C:\\Users\\migue\\Mega\\Git\\1DAM-Programming\\2Trimester\\11TextAndParameters\\TextAndParameters\\src\\main\\java\\Exercises\\Ex01and02PrimeNumbers\\primes.dat"));

      String text = "";

      //Print lines of text until no more are left, so while ends.
      while (text != null) {
        System.out.println(text);
        text = brd.readLine();
        }
    
        brd.close();
        
      //If file not found print error f (Can give to it any name)
    } catch (FileNotFoundException f) {
      System.out.println("File not found.");
      System.out.println("System error: " + f);

      //Cant write to file error
    } catch (IOException io) {
      System.out.println("Cant write to fle.");
      System.out.println("System error: " + io);
    
    }
  
  }

  
}
  
