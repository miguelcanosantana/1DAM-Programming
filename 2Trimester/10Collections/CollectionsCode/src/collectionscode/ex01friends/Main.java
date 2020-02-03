
package collectionscode.ex01friends;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
   public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
     // Creation of new ArrayList
     ArrayList<String> names = new ArrayList();
     System.out.println("Please input names: ");
     
     
     // Records the 6 names when there is input
     for (int i = 6; i > 0; i--){
       names.add(s.nextLine());
     }
     
     // Create an array from the ArrayList
     String names2[] = new String[names.size()]; //Gets the size of list
     names2 = names.toArray(names2);
     
     // Prints the 6 names when there is input
     for (int i = 0; i < 6; i++){
       System.out.println(names2[i]);
     }

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   }  
}
