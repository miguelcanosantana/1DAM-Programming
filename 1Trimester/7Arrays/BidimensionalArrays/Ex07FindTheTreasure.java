public class Ex07FindTheTreasure{
  public static void main(String[] args){

    //The grid of the game
    int[][] grid  = new int [5][5];

    //The position of mine
    int mineXPosition = (int) (Math.random()*5+1);
    int mineYPosition = (int) (Math.random()*5+1);

    //The position of the treasure
    int treasureXPosition = 0;
    int treasureYPosition = 0;

    //Makes sure the treasure doesn't override the mine
    do {
       treasureXPosition = (int) (Math.random()*5+1);
       treasureYPosition = (int) (Math.random()*5+1);

    } while ((treasureXPosition == mineXPosition)&&(treasureYPosition == mineYPosition));















  } 
} 