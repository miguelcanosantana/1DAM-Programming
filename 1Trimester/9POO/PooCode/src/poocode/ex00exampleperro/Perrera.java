package poocode.ex00exampleperro;

public class Perrera {
  public static void main(String[] args) {
    Perro p1 = new Perro("Mini");
    Perro p2 = new Perro("Dora");
    Perro p3 = new Perro("Curro");
    Perro p4 = new Perro("Mandy");
    
    //Perro sin nombre en función sobrecargada
    Perro g4 = new Perro();
  
    p1.ladra();
    p2.ladra();
    p3.ladra();
    p4.ladra();
    
    //Obtener e imprimir nombre de perro
    System.out.println(p4.getNombre());
    
    
  }
}
