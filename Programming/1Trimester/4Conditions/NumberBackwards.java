
//It's broken


public class NumberBackwards {
  public static void main(String[] args){
    
    String line1;
    System.out.print("Input a number and you will see if it can be read backwards:");
    line1 = System.console().readLine();
    double number;
    number = Double.parseDouble( line1 );
    
    boolean backwards = false;
    
    //1 digit number
    if (number < 10) {
      backwards = true;
    }
    //2 digits number
    if ((number >= 10) && (number < 100)){
      if ((number/10) == (number %10)){
        backwards = true;
      }
    }
    //3 digits number
    if ((number >= 100) && (number < 1000)){
      if ((number/100) == (number %10)){
        backwards = true;
      }
    }
    
    System.out.println ("It's " + backwards + " that the number can be read backwards.");
    
  }
}

