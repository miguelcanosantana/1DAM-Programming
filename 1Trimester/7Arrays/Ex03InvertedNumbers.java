import java.util.Scanner;

public class Ex04InvertedNumbers {
  public static void main(String[] args){
  
    int[] numbers = new int [10];
    Scanner s = new Scanner(System.in);
    
    //Ask user for numbers
    System.out.println("Please input 10 numbers, the order will be shown inverted.");
    for (int i = 9; i>=0; i--){
      numbers[i] = Integer.parseInt(s.nextLine());
    }
    
    System.out.println();
    
    //Shows array content

    System.out.println("Numbers shown in an inverse order:");

    for (int n : numbers){
      System.out.print(n + " ");
      
    }

  }
}

