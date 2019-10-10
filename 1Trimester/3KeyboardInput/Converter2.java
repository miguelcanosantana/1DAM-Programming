public class Converter2 {
  public static void main(String[] args){
    
    String line1;
    System.out.print("Write a number:");
    line1 = System.console().readLine();
    double pesetas;
    pesetas = Double.parseDouble( line1 );
    
    double pesetasToEur = pesetas / 166.386; //Pesetas to 1€
    System.out.println("You have " + pesetas + " pesetas" + " which means you have, " + pesetasToEur + " €");
    }
  }
