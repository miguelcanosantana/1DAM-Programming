public class Ex06GuessIt {
   public static void main(String[] args) {
     System.out.println("Wellcome to 'GuessIT', \n You need to guess a random number from 0 to 100. \n");
     int ranNumber = (int)(Math.random()*100);
     int guessNumber = 0;
     int countNumber = 5;
     
     do{
       
       if (countNumber != 5){
         System.out.print("You have " + countNumber + " tries left.\n Try again: ");
       }
       if (countNumber == 5){
         System.out.print("Enter the number: ");
       }
       guessNumber = Integer.parseInt(System.console().readLine());
       countNumber--;

     } while ((guessNumber != ranNumber) && (countNumber != 0));

     if (countNumber == 0){
       System.out.println("You have lost the game D':");
     } else {
       System.out.println("You won! :D");
     }
  }
}
