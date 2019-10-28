public class Ex01Dices3 {
   public static void main(String[] args) {
     System.out.println("This program is going to roll 3 dices...");
     int dice3 = (int)(Math.random()*6 + 1); //Casting for making it a round number
     int dice2 = (int)(Math.random()*6 + 1);
     int dice1 = (int)(Math.random()*6 + 1);
     int total = dice1 + dice2 + dice3;

     System.out.println("The 1st dice result is: " + dice1);
     System.out.println("The 2nd dice result is: " + dice2);
     System.out.println("The 3rd dice result is: " + dice3);
     System.out.println("The total value of the dices is: " + total);

  }
}
