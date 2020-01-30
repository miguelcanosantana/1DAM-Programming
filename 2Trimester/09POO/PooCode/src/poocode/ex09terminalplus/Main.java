package poocode.ex09terminalplus;

public class Main {
    public static void main(String[] args) {
      
      //Creating new mobiles
      System.out.println("Hola");
      Movil m1 = new Movil("678 11 22 33", "rata");
      Movil m2 = new Movil("644 74 44 69", "mono");
      Movil m3 = new Movil("622 32 89 09", "bisonte");

      
      //Checking initial called time is 0
      System.out.println(m1);
      System.out.println(m2);
      
      //Calling from a mobile to another and adding time to both
      m1.llama(m2, 320);
      m1.llama(m3, 200);
      m2.llama(m3, 550);

      
      //Display the time spent by all the mobile phones
      System.out.println(m1);
      System.out.println(m2);
      System.out.println(m3); 

    }
}
