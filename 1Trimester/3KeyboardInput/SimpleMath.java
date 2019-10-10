public class SimpleMath {
  public static void main(String[] args){
    
    
    String line1;
    System.out.print("Write x number:");
    line1 = System.console().readLine();
    int x;
    x = Integer.parseInt( line1 );
    
    String line2;
    System.out.print("Write y number:");
    line2 = System.console().readLine();
    int y;
    y = Integer.parseInt( line2 );
    
    System.out.println("X value is "+ x);
    System.out.println("Y value is "+ y);
    //Sum
    int sum = x + y;
    //Print Sum
    System.out.println("x+y="+ sum);
    //Subtraction
    int res = x - y;
    //Print Subtraction
    System.out.println("x-y="+ res);
    //Division
    int div = y / x;
    //Print Division
    System.out.println("y/x="+ div);
    //Multiply
    int mul = y * x;
    //Print Multiply
    System.out.println("y*x="+ mul);
      
    }
  }
