public class Ex03SpanishCards {
   public static void main(String[] args) {
     System.out.println("This program is going to show a card from a spanish crads deck...");
     int palo = (int)(Math.random()*4 + 1);
     int number = 0;
     //Se descartan los 8 y 9 de la baraja
     do{
       number = (int)(Math.random()*12 + 1);
     } while ((number == 8 ) || (number == 9 ));

     //Number
     if ((number >=2) && (number <= 7)){
       System.out.print(number + " de ");
      } else {

        if (number == 1){
          System.out.print("As de ");
        }

        if (number == 10){
          System.out.print("Sota de ");
        }

        if (number == 11){
          System.out.print("Caballo de ");
        }

        if (number == 12){
          System.out.print("Rey de  ");
        }
        }
          //Palo
          if (palo == 1){
            System.out.println("⚔️ (Espadas)");
          }
          if (palo == 2){
            System.out.println("🍷 (Copas)");
          }
          if (palo == 3){
            System.out.println("🟡 (Oros)");
          }
          if (palo == 4){
            System.out.println("🍭 (Bastos)");
          }
  }
}
