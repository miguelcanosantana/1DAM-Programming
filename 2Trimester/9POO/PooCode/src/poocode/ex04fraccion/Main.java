package poocode.ex04fraccion;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.print("Input the numerator: ");
    int numerator = Integer.parseInt(s.nextLine());
    
    System.out.print("Input the denominator: ");
    int denominator = Integer.parseInt(s.nextLine());
    
    Fraccion f1 = new Fraccion(numerator, denominator);
    
    System.out.println(f1.inverts(numerator, denominator));
    
    
    
    
    
    
    
    
  }
}
