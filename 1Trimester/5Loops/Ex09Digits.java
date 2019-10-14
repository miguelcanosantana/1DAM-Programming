public class Ex09Digits {
  public static void main(String[] args) { 
    System.out.print ("Please input a number and you will be tell it's digits number:  ");
    String line = System.console().readLine();
    int number = Integer.parseInt(line);
    int count = 1;

    int print = number; //Prints the number later, it's like a copy of the number int
    
    while (number >= 10){
      number = number / 10;
      count = count + 1;
    }
    System.out.println("The number " + print + " has " + count + " digits");
  }
}
