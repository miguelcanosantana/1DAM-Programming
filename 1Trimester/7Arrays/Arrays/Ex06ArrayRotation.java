import java.util.Scanner;

public class Ex06ArrayRotation {
  public static void main(String[] args){

    int[] numbers = new int [10];
    boolean isFirstTime = true;
    Scanner s = new Scanner(System.in);

    for (int i = 0; i<10; i++){

      if (isFirstTime == true){
        System.out.print("Please input a number: ");
        isFirstTime = false;

      } else {       
        System.out.print("Input another number:");
      }

      numbers[i] = Integer.parseInt(s.nextLine());

    }

 }
}

