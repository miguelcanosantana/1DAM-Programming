public class Ex13ReadList {
  public static void main(String[] args) { 
    System.out.println ("You will input 10 numbers, that will be analyzed to tell how many are negative and how many positive. ");
    int count = 0;
    int n1 = 0;
    int positives = 0;
    int negatives = 0;

    while (count <= 10) {
      System.out.println ("Input a number, there are " + (11-count) + " numbers left:");
      n1 = Integer.parseInt(System.console().readLine());
      if (n1 < 0) {
        negatives = negatives + 1;
        count = count + 1;

      }
      if (n1 >= 0) {
        positives = positives + 1;
        count = count + 1;
      }
    
    }

    System.out.println("You have " + positives + " positive numbers and " + negatives + " negative numbers.");


  }
}
