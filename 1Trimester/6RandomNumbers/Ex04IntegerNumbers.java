public class Ex04IntegerNumbers {
  public static void main(String[] args) {
    System.out.println("This program is going to print 20 Integer numbers from 0 to 10.");
    int number = 0;

    for (int i = 1; i <= 20; i++){
      number = (int)(Math.random()*11);
      System.out.print(number + " ");
    }
  }
}
