public class Ex02Cards {
   public static void main(String[] args) {
     System.out.println("This program is going to show a card from a deck...");
     int shape = (int)(Math.random()*4 + 1);
     int number = (int)(Math.random()*13 + 1);
  
     //Number
     if ((number >=2) && (number <= 10)){
       System.out.print(number + " of ");
      } else {

        if (number == 1){
          System.out.print("Ace of ");
        }

        if (number == 11){
          System.out.print("Jack of ");
        }

        if (number == 12){
          System.out.print("Queen of ");
        }

        if (number == 13){
          System.out.print("King of ");
        }
        }
          //Shape
          if (shape == 1){
            System.out.print("♥️");
          }
          if (shape == 2){
            System.out.print("♠️");
          }
          if (shape == 3){
            System.out.print("♦️");
          }
          if (shape == 4){
            System.out.print("♣️");
          }
  }
}
