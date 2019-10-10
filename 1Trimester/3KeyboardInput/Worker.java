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
    
    double money = days * hours * 12;
    
    System.out.println ("You will receive " + money + "€ each week.");
  }
}
