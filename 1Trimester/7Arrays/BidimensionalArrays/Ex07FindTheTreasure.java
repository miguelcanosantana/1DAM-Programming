import java.util.Scanner;

public class Ex07FindTheTreasure{
  public static void main(final String[] args){

    final Scanner s = new Scanner(System.in);

    //The position of dragon
    final int dragonXPosition = (int) (Math.random()*5);
    final int dragonYPosition = (int) (Math.random()*5);

    //The position of the treasure
    int treasureXPosition = 0;
    int treasureYPosition = 0;

    //Makes sure the treasure doesn't override the dragon
    do {
       treasureXPosition = (int) (Math.random()*5);
       treasureYPosition = (int) (Math.random()*5);

    } while ((treasureXPosition == dragonXPosition) && (treasureYPosition == dragonYPosition));

    //Debugging
    System.out.println("The X position of Dragon is " + (1+ dragonXPosition));
    System.out.println("The Y position of Dragon is " + (1+ dragonYPosition));
    System.out.println("The X position of Treasure is " + (1+ treasureXPosition));
    System.out.println("The Y position of Treasure is " + (1+ treasureYPosition));




    //The drawable grid of the game
    final String[][] grid  = new String [5][5];

    //First time
    int firstTime = 1;

    //User Pointer grid
    final int[][] pointer  = new int [5][5];

    int pointerX = 0;
    int pointerY = 0;

    //Game is playing
    boolean game = true;

    while (game = true){

    //Is the first time?
    if (firstTime == 1){

      //Assign [_] by default to all elements of the array and draw it.
      for (int i = 0; i < 5; i++){
        System.out.print(i + 1 + " ");
  
        for (int k = 0; k < 5; k++){
          grid[i][k] = "[_] ";
          System.out.print(grid[i][k]);
        }
        
        System.out.println();
      }
      System.out.printf("%-2s %-3s %-3s %-3s %-3s %-3s"," ","1","2","3","4","5\n");
      System.out.println();

      //Guide
      System.out.println("_-_-How to play-_-_");
      System.out.println("In this game there's a hidden TREASURE in this map.");
      System.out.println("Also there's a hidden DRAGON that protects the TREASURE.");
      System.out.println("Try to find the TREASURE without disturbing the DRAGON.");
      System.out.println();
      System.out.println("Good luck! (You will need it...)");
      firstTime = 0;


    //Other times
    } else {

      //Check input numbers are correct
        System.out.print("Input X coordinate: ");
        pointerX = (Integer.parseInt(s.nextLine()) -1);
    
        System.out.print("Input Y coordinate: ");
        pointerY = (Integer.parseInt(s.nextLine()) -1);

      //Draws result
      if (((pointerX == treasureXPosition) && (pointerY == treasureYPosition)) || ((pointerX == dragonXPosition) && (pointerY == dragonYPosition))){
      
        if ((pointerX == treasureXPosition) && (pointerY == treasureYPosition)){
          System.out.println("Treasure found!"); 
  
        }
    
        if ((pointerX == dragonXPosition) && (pointerY == dragonYPosition)){
          System.out.println("Dragon found!");
    
        }
  
      } else {
        grid[pointerY][pointerX] = "[X] ";
        System.out.println();
        System.out.println("Nothing found!");
        System.out.println();
      }

      //Prints updated grid
      for (int i = 0; i < 5; i++){
        System.out.print(i + 1 + " ");
  
        for (int k = 0; k < 5; k++){
          System.out.print(grid[i][k]);
        }
        
        System.out.println();
      }
      System.out.printf("%-2s %-3s %-3s %-3s %-3s %-3s"," ","1","2","3","4","5\n");
      System.out.println();

    }

    }







    




















  } 
} 