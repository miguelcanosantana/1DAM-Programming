public class SqRoot {
  public static void main(String[] args) {
    double x1;
    double x2;
    System.out.println("Please input equation values.");

    System.out.print("a = ");
    double a = Double.parseDouble(System.console().readLine());

    System.out.print("b = ");
    double b = Double.parseDouble(System.console().readLine());

    System.out.print("c = ");
    double c = Double.parseDouble(System.console().readLine());

//All situations 

    
//No solutions
  if((a==0)&&(b==0)&&(c!=0)){
   System.out.println("Equation has no solution.");
  }
//Infinite solutions
  if ((a==0)&&(b==0)&&(c==0)){
   System.out.println("Infinite solutions.");
  }
//Simplified
  if((a!=0)&&(b!=0)&&(c==0)){
  System.out.println("x1 = 0");System.out.println("x2 = "+(-b/a));
  }
//Simplified 2
  if((a==0)&&(b!=0)&&(c!=0)){
  System.out.println("x1 = x2 = "+(-c/b));
  }
  
double upPart = b * b -( 4 * a * c );

//Normal mode
  if((a!=0)&&(b!=0)&&(c!=0)){
    
    if (upPart < 0){
      System.out.println("No real solutions.");
    }else{
       System.out.println("x1 = "+(-b + Math.sqrt(upPart))/(2*a));
       System.out.println("x2 = "+(-b - Math.sqrt(upPart))/(2*a));
      }
    }
  }
}
    