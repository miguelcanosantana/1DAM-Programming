public class Cone {
  public static void main(String[] args){
    
    String line1;
    System.out.print("Height of the cone:");
    line1 = System.console().readLine();
    double height;
    height = Double.parseDouble( line1 );
    
    String line2;
    System.out.print("Radius of the cone:");
    line2 = System.console().readLine();
    double radius;
    radius = Double.parseDouble( line2 );
    
    double math1 =  Math.PI * (radius * radius) * height;
    double math2 = math1 / 3;
    System.out.println ("The cone volume is " + (float) math2 + "u3.");
  }
}
