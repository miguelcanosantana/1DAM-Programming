public class Ex11SqCube {
  public static void main(String[] args) { 
    System.out.print ("Please input a number: ");
    int nInput = Integer.parseInt(System.console().readLine());
    int n1 = nInput + 1;
    int n2 = n1 + 1;
    int n3 = n2 + 1;
    int n4 = n3 + 1;
    int n5 = n3 + 1;

    System.out.println(n1+ "     " + (n1*n1) + "     " + (n1*n1*n1));
    System.out.println(n2+ "     " + (n2*n2) + "     " + (n2*n2*n2));
    System.out.println(n3+ "     " + (n3*n3) + "     " + (n3*n3*n3));
    System.out.println(n4+ "     " + (n4*n4) + "     " + (n4*n4*n4));
    System.out.println(n5+ "     " + (n5*n5) + "     " + (n5*n5*n5));

  }
}
