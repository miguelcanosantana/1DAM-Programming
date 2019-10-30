public class Ex05IntegerNumbers50 {
  public static void main(String[] args) {
    System.out.println("This program is going to print 50 Integer numbers from 100 to 199.");
    int number = 0;
    int total = 0;
    int smallest = 199;
    int biggest = 100;
    
    for (int i = 1; i <= 50; i++){

      do{
        number = (int)(Math.random()*200);
      } while (number < 100);
        total = total + number;
        System.out.print(number + " ");

        if (number < smallest){
          smallest = number;
        }
        if (number > biggest){
          biggest = number;
        }
        
    }

    System.out.println("");
    System.out.println("");
    System.out.println("The smallest is " + smallest);
    System.out.println("");
    System.out.println("The biggest is " + biggest);
    System.out.println("");
    System.out.println("The average is " + (total / 50));
  }
}
