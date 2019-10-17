import java.util.Scanner; //For using scanner you need to import it first.

public class Ex19Pyramid {
  public static void main(String[] args) { 
    /*You only need to define Scanner once if you use .nextLine() , because it will 
    jump as the name says to the next line every time an input prompt jumps
    */
    Scanner s = new Scanner(System.in);

    //This is the use of scanner (For reading Integer numbers)
    System.out.print ("Please input the height of the pyramid:  ");
    int h = Integer.parseInt(s.nextLine());

    //This is another use of scanner (For reading symbols)
    System.out.print ("Please input the fill character:  ");
    String character = s.nextLine();

    int charPerRow = 1;
    int spacesBefore = h - 1;

    //Draws columns
    for (int i = 0; i < h ; i = i + 1){
      
      //Spaces before characters
      for (int m = 1; m <= spacesBefore; m++){
          System.out.print(" ");
        }

       //Draws rows (in spanish "filas")
       for (int k = 0; k < charPerRow; k++){
          System.out.print(character);
        }
      charPerRow = charPerRow + 2;
      spacesBefore =  spacesBefore - 1;
      System.out.println();
    }
  }
}
