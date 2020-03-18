public class Sum {
  public static void main(String[] args){
    //---------1 FIRST NUMBER----------
    //Creates a variable called "line1"
    String line1;
    System.out.print("Write a number:");
    //Reads line1
    line1 = System.console().readLine();
    //Creates a variable called "number1"
    int number1;
    //Takes the number as "Int" and assigns it to a variable
    number1 = Integer.parseInt( line1 );
    
    //--------2 SECOND NUMBER----------
    //Creates a variable called "line2"
    String line2;
    System.out.print("Write another number:");
    //Reads line2
    line2 = System.console().readLine();
    //Creates a variable called "number2"
    int number2;
    //Takes the number as "Int" and assigns it to a variable
    number2 = Integer.parseInt( line2 );
  
    //--------CALC RESULT NUMBER----------
    
    int resultNum = number1 + number2;
    System.out.println ("Your result number is " + resultNum);

    
    
  }
}





