public class KbMb {
  public static void main(String[] args){
    
    String line1;
    System.out.print("How many kb's:");
    line1 = System.console().readLine();
    double kb;
    kb = Double.parseDouble( line1 );
    
    double mb = kb / 1000;
    
    System.out.println ("You have " + (float) mb + "Mb's");
    
  }
}
