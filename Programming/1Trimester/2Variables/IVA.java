public class IVA {
  public static void main(String[] args){
		
		double aguacate = 0.6;
		double aguab = 2;
		double mazorca = 1.5;
		double cd24k = 999.99;
		double iphone= 1250.5;
		
		double precioSin = aguab + aguacate + mazorca + cd24k + iphone;
		double precioIva = precioSin * 1.21;
		
		
		System.out.println ("Avocado = " + aguacate + "(€)");
		System.out.println ("Bezoya Water= " + aguab + "(€)");
		System.out.println ("Corn = " + mazorca + "(€)");
		System.out.println ("CD of La Rosalía Special edition 24K = " + cd24k + "(€)");
		System.out.println ("Iphone 234 XR+- = " + iphone + "(€)");
		System.out.println ("\n");
		System.out.println ("Price without IVA = " + precioSin + "(€)");
		System.out.println ("Price with IVA = " + (float) precioIva + "(€)");
    }
  }
