public class MbKb {
  public static void main(String[] args){
    
    String line1;
    System.out.print("How many Mb's:");
    line1 = System.console().readLine();
    double mb;
    mb = Double.parseDouble( line1 );
    
    double kb = mb * 1000;
    
    System.out.println ("You have " + (float) kb + "kb's");
    
  }
}
