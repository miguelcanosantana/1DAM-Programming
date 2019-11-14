import java.util.Scanner;

public class Ex05MaxMin {
  public static void main(String[] args){

    int[] numbers = new int [10];
    boolean isFirstTime = true;
    int min = 0;
    int max = 0;
    Scanner s = new Scanner(System.in);

    for (int i = 0; i<10; i++){

      if (isFirstTime == true){
        System.out.print("Please input a number: ");

      } else {
        System.out.print("Input another number:");
      }

      numbers[i] = Integer.parseInt(s.nextLine());

      if (isFirstTime == true){
        min = numbers[i];
        max = numbers[i];
        isFirstTime = false;

      } else {

        if (numbers[i] < min){
          min = numbers[i];
        }
        if (numbers[i] > max){
          max = numbers[i];
        }
      }
    }

System.out.println("");
  for (int i = 0; i < 10; i++){
    System.out.print(numbers[i]);

    if (numbers[i] == max){
      System.out.println(" Max");
    }

    if (numbers[i] == min){
      System.out.println(" Min");
    }

    if ((numbers[i] != max) && (numbers[i] != min)){
      System.out.println("");
    }

  }

 }
}

