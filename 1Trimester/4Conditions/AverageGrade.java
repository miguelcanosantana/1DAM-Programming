public class AverageGrade {
  public static void main(String[] args){
    
    String line1;
    System.out.print("Input your first grade: ");
    line1 = System.console().readLine();
    double g1;
    g1 = Double.parseDouble( line1 );
    
    String line2;
    System.out.print("Input your second grade: ");
    line2 = System.console().readLine();
    double g2;
    g2 = Double.parseDouble( line2 );
    
    String line3;
    System.out.print("Input your third grade: ");
    line3 = System.console().readLine();
    double g3;
    g3 = Double.parseDouble( line3 );
    
  
    if ((g1 >= 0) && (g2 >= 0) && (g3 >= 0)) {
      double all = g1 + g2 + g3;
      double result = all / 3;
      System.out.println ("Your average grade is " + result );
    }else{
      System.out.println ("Please input valid grades...");
    }
    
  }
}
