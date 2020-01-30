
package collectionscode.ex01friends;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
   public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
     //Creation of new ArrayList (CAN REMOVE 1ST "<String>"?)
     ArrayList<String> names = new ArrayList<String>();
     System.out.println("Please input names: ");
     
     
     //Records the 6 names when there is input
     for (int i = 6; i > 0; i--){
       names.add(s.nextLine());
     }
     
     //Prints the recorded names
     System.out.println("Names: ");
     System.out.println(names);

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   }  
}
