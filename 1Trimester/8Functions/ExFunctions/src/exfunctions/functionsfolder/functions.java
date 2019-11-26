/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exfunctions.functionsfolder;


public class functions {
  

  
  public static boolean isCapicua (int x1) {
    return (x1 == flipNumber (x1));
  }
  
  public static boolean isPrime (int x1) {
    return (x1 == primeNumber (x1));
  }
  
  public static int nextPrime (int x1) {
    return (0);
  }
  
  public static int power (int x1, int power) {
    return  (int) Math.pow(x1, power);
  }
  
  public static int digits (int x1, int backupX1, int digitsNumber, int returnTwice[]){
    backupX1 = x1;
    
    while (x1 >=1) {
      x1 = (x1 / 10);
      digitsNumber++;    
    }
    returnTwice[0] = backupX1;
    returnTwice[1] = digitsNumber;
    
    return(returnTwice[]);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
