import java.util.Scanner;

public class Ex07FindTheTreasure{
  public static void main(String[] args){

    Scanner s = new Scanner(System.in);

    //The position of dragon
    int dragonXPosition = (int) (Math.random()*5);
    int dragonYPosition = (int) (Math.random()*5);

    //The position of the treasure
    int treasureXPosition = 0;
    int treasureYPosition = 0;

    //Makes sure the treasure doesn't override the dragon
    do {
       treasureXPosition = (int) (Math.random()*5);
       treasureYPosition = (int) (Math.random()*5);

    } while ((treasureXPosition == dragonXPosition) && (treasureYPosition == dragonYPosition));

    //Debugging
    System.out.println("The X position of Dragon is " + dragonXPosition);
    System.out.println("The Y position of Dragon is " + dragonYPosition);
    System.out.println("The X position of Treasure is " + treasureXPosition);
    System.out.println("The Y position of Treasure is " + treasureYPosition);

    //User Pointer grid
    int[][] pointer  = new int [5][5];

    int pointerX = 0;
    int pointerY = 0;

    System.out.print("Input X coordinate: ");
    pointerX = (Integer.parseInt(s.nextLine()) -1);

    System.out.print("Input Y coordinate: ");
    pointerY = (Integer.parseInt(s.nextLine()) -1);

    if (((pointerX == treasureXPosition) && (pointerY == treasureYPosition)) || ((pointerX == dragonXPosition) && (pointerY == dragonYPosition))){
      
      if ((pointerX == treasureXPosition) && (pointerY == treasureYPosition)){
        System.out.println("Treasure found!"); 

      }
  
      if ((pointerX == dragonXPosition) && (pointerY == dragonYPosition)){
        System.out.println("Dragon found!");
  
      }

    } else {
      System.out.println("Nothing found!");
    }

    //The drawable grid of the game
    String[][] grid  = new String [5][5];


    //Drawing Grid
    System.out.printf("%-2s %-3s %-3s %-3s %-3s %-3s"," ","1","2","3","4","5");
    System.out.println();
    System.out.printf("%-1s %-2s %-2s %-2s %-2s %-2s","1","[_]","[_]","[_]","[X]","[_]\n");
    System.out.printf("%-1s %-2s %-2s %-2s %-2s %-2s","2","[_]","[_]","[_]","[_]","[_]\n");
    System.out.printf("%-1s %-2s %-2s %-2s %-2s %-2s","3","[_]","[_]","[_]","[_]","[_]\n");
    System.out.printf("%-1s %-2s %-2s %-2s %-2s %-2s","4","[_]","[_]","[_]","[_]","[_]\n");
    System.out.printf("%-1s %-2s %-2s %-2s %-2s %-2s","5","[_]","[_]","[_]","[_]","[_]\n");






    




















  } 
} 