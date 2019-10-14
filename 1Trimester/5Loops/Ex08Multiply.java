public class Ex08Multiply {
  public static void main(String[] args) { 
    System.out.print ("Please input a number that will be multiplied up to 10:  ");
    String line = System.console().readLine();
    int number = Integer.parseInt(line);
    int multiply = 0;
    
    for (int count = 0; count <= 10; count = count + 1) {
      multiply = number * count;
      System.out.println(multiply);

    }
  }
}