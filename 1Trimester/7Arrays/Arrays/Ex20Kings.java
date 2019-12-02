import java.util.Scanner;

public class Ex20Kings {
  public static void main(String[] args){

    Scanner s = new Scanner(System.in);

    //Number of kings
    int number = 0;
    System.out.print("Please input the number of kings: ");
    number = Integer.parseInt(s.nextLine());

    String[] names = new String [number];

    //Write kings names
    for (int i = 0; i < number; i++){

      System.out.print("Please input king name: ");
      names[i] = s.nextLine();
    }

    //Print kings names
    for (int i = 0; i < number; i++){
      System.out.println(names[i]);
    }





 }
}

