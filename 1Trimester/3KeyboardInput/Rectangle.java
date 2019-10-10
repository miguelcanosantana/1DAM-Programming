public class Rectangle {
  public static void main(String[] args){
    String line1;
    System.out.print("Write the rectangle length:");
    line1 = System.console().readLine();
    double len;
    len = Double.parseDouble( line1 );
    String line2;
    System.out.print("Write the rectangle wide:");
    line2 = System.console().readLine();
    double wid;
    wid = Double.parseDouble( line2 );

    //Rectangle Area

    double area = len * wid;
    System.out.println ("With a wide of " + wid + "u"+ " and the length of " + len + "u" + " You get a rectangle of " + area + "u2");


  }
}
