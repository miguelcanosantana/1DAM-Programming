public class Ex07Quiniela {
   public static void main(String[] args) {
     System.out.println("This program will print a quiniela with 14 bets.");
     int ranNumber = 0;
     System.out.println("_______________");

     for (int i = 14; i>0; i--){

       for (int h = 3; h > 0; h--){
        ranNumber = (int)(Math.random()*3);

        switch(ranNumber){
          case 0: 
          System.out.print("|1__|");
          break;
  
          case 1: 
          System.out.print("|_X_|");
          break;
  
          case 2: 
          System.out.print("|__2|");
          break;
        }

       }
       System.out.println("");
    }
  }
}
