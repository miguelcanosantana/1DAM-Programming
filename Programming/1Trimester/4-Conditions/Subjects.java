public class Subjects {
  public static void main(String[] args) {
    String day;
    System.out.print("Input a day of the week and you will see the first subject: ");
    day = (System.console().readLine());
    day.toLowerCase(); 
    // Converts day to lowercase
    switch(day) {
      case "monday":
      //If none instructions are input it continues below
      case "tuesday":

      case "wednesday":
      System.out.println("Programming");
      break;
    
      case "thursday":
      System.out.println("Informatic Systems");
      break;
      
      case "friday":
      System.out.println("Databases");
      break;
      
      case "saturday":
      break;
      
    default: System.out.println("Day not recognized");
    
    
    System.out.println("Please, input a day.");
    }
  }
}
