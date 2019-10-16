public class Ex10AverageMark {
  public static void main(String[] args) { 
    System.out.print ("This program will tell you your Average Marks, please input your first mark now. Also input any negative numbers to stop adding marks and calculate your final result. ");
    int number = 0;
    int count = 0;
    int add = 0;
    int math = 0;
    
    while (number >= 0){
      System.out.print ("Please input a number: ");
      String line = System.console().readLine();
      number = Integer.parseInt(line);
      count = count + 1;
      add = (add + number);
      
     
    }
    math = (add - number) / (count -1);

    System.out.println("Your Average Mark is " + math);
  }
}
