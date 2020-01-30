package poocode.ex08terminal;

public class Main {
    public static void main(String[] args) {
      
      //Creating new terminals
      Terminal t1 = new Terminal ("678 11 22 33");
      Terminal t2 = new Terminal("644 74 44 69");
      Terminal t3 = new Terminal("622 32 89 09");
      Terminal t4 = new Terminal("664 73 98 18");
      
      //Checking initial called time is 0
      System.out.println(t1);
      System.out.println(t2);
      
      //Calling from a terminal to another and adding time to both
      t1.llama(t2, 320);
      t1.llama(t3, 200);
      
      //Display the time spent by all the terminals
      System.out.println(t1);
      System.out.println(t2);
      System.out.println(t3);
      System.out.println(t4);
    }
}
