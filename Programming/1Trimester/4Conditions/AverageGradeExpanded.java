public class AverageGradeExpanded {
  public static void main(String[] args){
    System.out.println("Input your grades and this program will tell you how good are them.");

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
    
      if (result < 5 ) {
         System.out.print("At least you tried...");
       
       }else if (result < 6 ){
         System.out.print("It's okey.");
            
       }else if (result < 7 ){
         System.out.print("Well done.");
                  
       }else if (result < 9 ){
         System.out.print("Really well done!");

       }else if (result < 10 ){
         System.out.print("WOW!");
         
       }else if (result == 10 ){
         System.out.print("You are the new Stephen Hawking.");
       
       }else{
      System.out.println ("Please input valid grades");
      
      }
    }
    
  }
}
