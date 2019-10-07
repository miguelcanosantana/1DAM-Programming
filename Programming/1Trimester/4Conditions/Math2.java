public class Math2 {
  public static void main(String[] args){
    
    String line1;
    System.out.print("Input a height (in meters): ");
    line1 = System.console().readLine();
    double h;
    h = Double.parseDouble( line1 );
    double g = 9.81;
    
    if (h < 0){
      System.out.println ("Height can't be a negative number");
      } else {
        double tResult = (Math.sqrt(( 2 * h ) / ( g )));
        System.out.println(" An object will fall from " + h + " meters in "
         + (float)tResult + " seconds.");
        
       
    }
  }
}
