public class Converter1 {
  public static void main(String[] args){
    
    String line1;
    System.out.print("Write a number:");
    line1 = System.console().readLine();
    double euros;
    /*"Double.parseDouble" is written 
    when decimals need to be input or shown
    */
    euros = Double.parseDouble( line1 );
    
    double eurToPesetas = 166.386 * euros; //1€ to pesetas
    System.out.println("You have " + euros + "€,"+" which means you have, " + eurToPesetas + " pesetas");
    }
  }
