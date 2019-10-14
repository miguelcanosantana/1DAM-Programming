import jdk.internal.util.xml.impl.Input;

public class Ex07SurpriseBox {
  public static void main(String[] args) { 
    System.out.print ("Please input the correct password to open the box: ");
    String passwd = System.console().readLine();

    for (int count = 5; ( (!(passwd.equals("0666"))) && (count>=1) ); count = count - 1){
      System.out.print ("You have " + count + " remaining attempts. Try again please: ");
      passwd = System.console().readLine();
    } 
    if (passwd.equals("0666")){
      System.out.println("The Pandora Box has been opened...");

    }
    else{
      System.out.println("Your precious box got locked.");
      
    }    
  }
}