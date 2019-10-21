import java.util.Scanner;

public class Ex69MayaPyramid {
  public static void main(String[] args) { 

    Scanner s = new Scanner(System.in);

    System.out.print ("Please input the height of the pyramid:  ");
    int h = Integer.parseInt(s.nextLine());


    int charPerRow = 1;
    int spacesBefore = h - 1;
 //Normal Pyramid
    //Draws columns
    for (int i = 0; i < h ; i = i + 1){
   
      //Spaces before characters
      for (int m = 1; m <= spacesBefore; m++){
          System.out.print(" ");
        }
      //Draws left rows
       for (int k = 0; k < charPerRow; k++){
          System.out.print("*");
        }
       //Draws central rows
        if (i % 2 == 0) {  //When i is par
           System.out.print("----");
        } else { 
            System.out.print("    ");

        }

      //Draws right rows
       for (int k = 0; k < charPerRow; k++){
          System.out.print("*");
        }
      
      charPerRow = charPerRow + 1;
      spacesBefore =  spacesBefore - 1;
      System.out.println();
    }













  }
}