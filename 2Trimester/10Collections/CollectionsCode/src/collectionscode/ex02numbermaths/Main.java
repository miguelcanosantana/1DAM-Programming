
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
     System.out.println();
     
     
     // Records the numbers between 0 and 100
     int ranNum;
     
     for (int i = 0; i < length; i++){   
       ranNum = (int)(Math.random()*101);
       numbers.add (ranNum);
       
     }
     
    System.out.println("These are the numbers:");
    System.out.println(numbers);
    System.out.println();
    
    //Math
    int tempNumber;
    
      //Adding
      int addingResult = 0;
      
       for (int i = 0; i < length; i++){   
         tempNumber = numbers.get(i);
         addingResult = addingResult + tempNumber;
         
       }  
       
       System.out.println("The total adding is: " + addingResult + ".");
       
       //Average
       double averageResult = (double) (addingResult / length);
       System.out.println("The average is: " + averageResult + ".");
       System.out.println();
       
       
       //Max and Min
       //(Default Max and Min)
       int maxNum = numbers.get(0);
       int minNum = numbers.get(0);
       
       for (int i = 0; i < length; i++){   
         tempNumber = numbers.get(i);
         
         if (tempNumber > maxNum){
           maxNum = tempNumber;
         }
         
         if (tempNumber < minNum){
           minNum = tempNumber;
         }
             
       }  

       System.out.println("The 'MAX' number is: " + maxNum + ".");
       System.out.println("The 'min' number is: " + minNum + ".");
       
       
  }
  
}
