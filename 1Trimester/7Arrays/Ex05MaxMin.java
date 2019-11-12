import java.util.Scanner;

public class Ex05MaxMin {
  public static void main(String[] args){

    int[] numbers = new int [10];
    int firstTime = 1;
    int min = 0;
    int max = 0;
    Scanner s = new Scanner(System.in);

    for (int i = 0; i<10; i++){

      if (firstTime == 1){
        System.out.print("Please input a number: ");
        firstTime = 0;
      } else {
        System.out.print("Input another number:");
      }

      numbers[i] = Integer.parseInt(s.nextLine());

      if (firstTime == 1){
        min = numbers[0];
        max = numbers[0];
      } else {

        if (numbers[i] < min){
          min = numbers[i];
        }
        if (numbers[i] > max){
          max = numbers[i];
        }
      }
    }
    //Terminar
for (int i = 0; i < 10; i++){


} 

    /* System.out.printf("%-8s %-8s %-8s\n", number[i], square[i], cube[i]); */



  }
}

