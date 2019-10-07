public class NumberDigits {
  public static void main(String[] args){
    
    String line1;
    System.out.print("Input a number and you will see it's last part:");
    line1 = System.console().readLine();
    double number;
    number = Double.parseDouble( line1 );
    
    System.out.println(number%10);
    
  }
}

