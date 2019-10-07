public class Hour {
  public static void main(String[] args) {
    
    System.out.print("Please input an hour: ");
    String line1 = (System.console().readLine());
    int hour= Integer.parseInt (line1);
    
    System.out.print("Please input the minutes: ");
    String line2 = (System.console().readLine());
    int minutes= Integer.parseInt (line2);
    
    int currentSeconds = (hour * 3600) + (minutes * 60);
    int secondsToMidnight = (24 * 3600) - currentSeconds;
    
    System.out.println("There are " + secondsToMidnight + " seconds until midnight.");
  }
  
}

