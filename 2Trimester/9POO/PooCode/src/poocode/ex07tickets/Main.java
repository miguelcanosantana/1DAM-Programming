package poocode.ex07tickets;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) { 
    //Create zones with selling tickets 
    Zona z1 = new Zona (1000);
    Zona z2 = new Zona (200);
    Zona z3 = new Zona (25);
    
    
    
    //Program
    Scanner s = new Scanner(System.in);
    int chooseAction;
    int ticketsAvailable;
    
    do{
    System.out.println("Welcome to the sales program of Expocoches Campanillas, please, choose an action:");
    System.out.println("");
    System.out.println("1. Show number of tickets available.");
    System.out.println("2. Buy tickets.");
    System.out.println("3. Exit.");
    System.out.println("");
    System.out.print("Input: ");
    chooseAction= Integer.parseInt(s.nextLine());
    
    } while ((chooseAction < 1) || (chooseAction > 3));
    
    //Show tickets
    if (chooseAction == 1){
      do{
      System.out.println("Select the zone:");
      System.out.println("");
      System.out.println("1. Main Hall Zone.");
      System.out.println("2. Selling Zone.");
      System.out.println("3. VIP Zone.");
      System.out.println("4. Exit.");
      System.out.println("");
      System.out.print("Input: ");
      chooseAction= Integer.parseInt(s.nextLine());

      } while ((chooseAction < 1) || (chooseAction > 4));
      
        if (chooseAction == 1){
          if (z1.getEntradasPorVender() == 0){
            System.out.println("There are no Tickets left in this zone.");
          } else {
            System.out.println(z1.getEntradasPorVender() + " Tickets left on this zone.");   
          }
          
        }
        if (chooseAction == 2){
          if (z2.getEntradasPorVender() == 0){
            System.out.println("There are no Tickets left in this zone.");
          } else {
            System.out.println(z2.getEntradasPorVender() + " Tickets left on this zone.");   
          }
        }      
        if (chooseAction == 3){
          if (z3.getEntradasPorVender() == 0){
            System.out.println("There are no Tickets left in this zone.");
          } else {
            System.out.println(z3.getEntradasPorVender() + " Tickets left on this zone.");   
          }          
        }      
    }
    
    if (chooseAction == 2){
      do{
      System.out.println("Select the zone:");
      System.out.println("");
      System.out.println("1. Main Hall Zone.");
      System.out.println("2. Selling Zone.");
      System.out.println("3. VIP Zone.");
      System.out.println("4. Exit.");
      System.out.println("");
      System.out.print("Input: ");
      chooseAction= Integer.parseInt(s.nextLine());

      } while ((chooseAction < 1) || (chooseAction > 4));
      
      
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  } 
}
