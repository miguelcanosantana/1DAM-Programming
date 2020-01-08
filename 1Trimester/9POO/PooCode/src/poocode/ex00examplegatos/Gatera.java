
package poocode.ex00examplegatos;

public class Gatera {

  public static void main(String[] args) {
    Gato g1 = new Gato("Fantasma");
    Gato g2 = new Gato("Pitipu");
    Gato g3 = new Gato("Tirion");
    //Gato sin nombre en función sobrecargada
    Gato g4 = new Gato();
  
    g1.maulla();
    g2.maulla();
    g3.maulla();
    g4.maulla();
    
    //Cambio con setter de nombre de gato
    g4.setNombre("Whisky");
    g4.maulla();
    
    //Obtener e imprimir nombre de gato
    System.out.println(g4.getNombre());
  }
}
