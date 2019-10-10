public class Worker {
  public static void main(String[] args){
    
    String line1;
    System.out.print("How many hours do you work at day?:");
    line1 = System.console().readLine();
    double hours;
    hours = Double.parseDouble( line1 );
    
    String line2;
    System.out.print("How many days do you work at week?:");
    line2 = System.console().readLine();
    double days;
    days = Double.parseDouble( line2 );
    
    double totalhours = days * hours;
    double moneyhour = 0;
      
      if (totalhours <= 40){
        moneyhour = 12;
      } else {
          moneyhour = 16;
      }
      
      double totalmoney = moneyhour * totalhours;
    
    System.out.println ("You will receive " + totalmoney + "€ each week.");
    
  }
}

