public class Hours {
  public static void main(String[] args) {
    
    System.out.print("Please write an hour in 24h format without the minutes: ");
    String line = (System.console().readLine());
    int time = Integer.parseInt (line);
    
    if ((time >= 6) && (time < 12)){
      
      System.out.print("Good morning!");
      
    }
      
    if ((time >= 12) && (time < 20)){
      
      System.out.print("Good afternoon!");
      
    }
      
    if (((time >= 20) && (time <= 24)) || ((time >= 0) && (time < 6))){
      
      System.out.print("Good night!");
      
    }
      
      
      }
    }

