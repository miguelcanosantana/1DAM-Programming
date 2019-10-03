public class Day {
  public static void main(String[] args) {
    
    System.out.print("Please input today's number of the day of this week: ");
    String line = (System.console().readLine());
    int day = Integer.parseInt (line);
    
    String dayname;
    
    switch (day) {
      
      case 1:
        dayname = "is Monday, let's get back to the work!";
        break;
        
      case 2:
        dayname = "is Tuesday";
        break;
        
      case 3:
        dayname = "is Wednesday";
        break;
        
      case 4:
        dayname = "is Thursday";
        break;
        
      case 5:
        dayname = "♫ It's Friday, Friday. Gotta get down on Friday ♫";
        break;
        
      case 6:
        dayname = "is Saturday, let's go to the beach!, if it's not winter...";
        break;
        
      case 7:
        dayname = "is Sunday, your last day of relax.";
        break;
    
    default: dayname = "is a non existent day, please input a correct number.";
    }
    
  System.out.println( "Today " + dayname );
    
  }
  
}

