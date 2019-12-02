/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exfunctions.functionsfolder;


public class Functions {
  

  
  /*public static boolean isCapicua (int x1) {
    return (x1 == flipNumber (x1));
  }*/
  
  //Number flip number
  public static int flipNumber (int x1) {
    int x1Digit;
    int flipped = 0;
    while (x1 !=0){
      x1Digit = x1 % 10;
      flipped = flipped * 10 + x1Digit;
      x1 = x1 / 10;
    }
    return flipped;
  
  }
  
  
  
  /*public static boolean isprime (int x1) {
    return (x1 == primeNumber (x1));
  }*/
  
  
  //Number powered
  public static int power (int x1, int power) {
    return (int) Math.pow(x1, power);
  }
  
  //Number of digits
  public static int digits (int x1, int digitsNumber){
    while (x1 >=1) {
      x1 = (x1 / 10);
      digitsNumber++;    
    }
    
    return digitsNumber;
  }
  
  //Glues a digit to a number before it
  public static String gluebefore (int x1, int otherNumber, String gluedNumber){
    
    gluedNumber = ("" + otherNumber + "" + x1 + "");
    
    return gluedNumber;
  }
  
  //Glues a digit to a number after it
  public static String glueafter (int x1, int otherNumber, String gluedNumber){
    
    gluedNumber = ("" + x1 + "" + otherNumber + "");
    
    return gluedNumber;
  }
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
