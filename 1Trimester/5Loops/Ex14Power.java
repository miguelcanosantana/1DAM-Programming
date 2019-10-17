public class Ex14Power {
  public static void main(String[] args) { 
    System.out.print ("Please input a base number, must be an Integer:  ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print ("Please input a base number, must be an exponential one:  ");
    int exp = Integer.parseInt(System.console().readLine());
    
    double result = Math.pow(base, exp);
    System.out.println("The result is " + result);
  }
}
