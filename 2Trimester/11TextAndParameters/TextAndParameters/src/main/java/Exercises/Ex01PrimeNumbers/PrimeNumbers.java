package Exercises.Ex01PrimeNumbers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeNumbers {
  public static void main(String[] args){
  
    try {
      //Write document to written.txt
      BufferedWriter bwr = new BufferedWriter(new FileWriter("C:\\Users\\migue\\Mega\\Git\\1DAM-Programming\\2Trimester\\11TextAndParameters\\TextAndParameters\\src\\main\\java\\Exercises\\Ex01PrimeNumbers\\primes.dat"));

      //Print lines of text until no more are left, so while ends.      
        for (int i = 0; i < 500; i++) {
          if (isPrime(i)) {
            System.out.println(i + "\n");
            bwr.write(i + "\n");
          }
        }
        bwr.close();
        
        

    

      //Recording Error
    }  catch (IOException io) {
      System.out.println("Recording Error");
      System.out.println("System error: " + io);

    }
    
  }
  
  
  //isPrime for checking primes (returns true or false)
  public static boolean isPrime(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
  return true;
  
  
  }
  
  
}
  
