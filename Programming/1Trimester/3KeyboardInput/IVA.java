public class IVA {
  public static void main(String[] args){
    
    String line1;
    System.out.print("Write a price for the object 1:");
    line1 = System.console().readLine();
    double object1;
    object1 = Double.parseDouble( line1 );
    
    String line2;
    System.out.print("Write a price for the object 2:");
    line2 = System.console().readLine();
    double object2;
    object2 = Double.parseDouble( line2 );
    
    String line3;
    System.out.print("Write a price for the object 3:");
    line3 = System.console().readLine();
    double object3;
    object3 = Double.parseDouble( line3 );
    

  double precioSin = object1 + object2 + object3;
  double precioIva = precioSin * 1.21;
  System.out.println ("Price without IVA = " + precioSin + "(€)");
  System.out.println ("Price with IVA = " + (float) precioIva + "(€)");
  }
}
