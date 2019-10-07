public class Math3 {
  public static void main(String[] args){
    
    String line1;
    System.out.print("Input a number for a: ");
    line1 = System.console().readLine();
    double a;
    a = Double.parseDouble( line1 );
    
    String line2;
    System.out.print("Input a number for b: ");
    line2 = System.console().readLine();
    double b;
    b = Double.parseDouble( line2 );
    
    
    
    if (b == 0){
      System.out.println ("Number b can't be a 0");
      } else {
        double xResult = (b * (-1)) / (a);
        System.out.println ( "x " + "= " + xResult );
        
        //xResult is the result after resolving ax+b=0
        }
        
    
  
    
  }
}
