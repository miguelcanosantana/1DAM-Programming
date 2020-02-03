
package collectionscode.ex02numbermaths;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
     // Creation of new ArrayList (Using Integer)
     ArrayList<Integer> numbers = new ArrayList();
     System.out.println("Random values between 0 and 100: ");
     
     
     // Create between 10 and 20 numbers
     int length = (int) (Math.random()*(20-9) + 10);
     System.out.println("The amount of numbers will be " + length + ".");
     
     
     // Records the numbers between 0 and 100
     int ranNum;
     
     for (int i = 0; i < length; i++){   
       ranNum = (int)(Math.random()*101);
       numbers.add (ranNum);
       
     }
     
    System.out.println("These are the numbers:");
    System.out.println(numbers);
    
    //Math
    int tempNumber;
    
      //Adding
      int addingResult = 0;

       for (int i = 0; i < length; i++){   
         tempNumber = numbers.get(i);
         addingResult = addingResult + tempNumber;
         
       }
       
       System.out.print("The total adding is: " + addingResult + ".");

    
    
    
    
  }
  
}
