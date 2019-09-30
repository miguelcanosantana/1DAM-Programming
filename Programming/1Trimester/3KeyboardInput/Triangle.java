public class Triangle {
  public static void main(String[] args){
    String line1;
    System.out.print("Write the triangle height:");
    line1 = System.console().readLine();
    double height;
    height = Double.parseDouble( line1 );
    String line2;
    System.out.print("Write the triangle wide:");
    line2 = System.console().readLine();
    double wid;
    wid = Double.parseDouble( line2 );

    //Rectangle Area

    double area = (height * wid) / 2;
    System.out.println ("With a wide of " + wid + "u"+ " and the length of " + height + "u" + " You get a triangle of " + area + "u2");


  }
}
