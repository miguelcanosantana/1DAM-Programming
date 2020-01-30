
package poocode.ex00examplegatos;

public class Gato {
  // Atributos (Características)
  String color;
  String sexo;
  String raza;
  int edad;
  String nombre;
  String numeroChip;
  
  
  // Métodos (Comportamientos)

    //Tengo Gato al que le paso un nombre
    public Gato(String n) {
      this.nombre = n;
    }
    
    //Tengo Gato Anónimo
    public Gato() {
      this.nombre = null;
    }
    
    //El gato dice su nombre y maulla
    void maulla(){
      if (this.nombre == null) {
        System.out.println("Soy un gato anónimo");
      } else {
        System.out.println("Soy " + this.nombre);
      }
    System.out.println("MEOOOW...");
    }
    
    //Establece el nombre dado como el del gato
    public void setNombre(String n) {
      this.nombre = n;
    }
    
    
    public String getNombre() {
      return nombre;
    }
  
    
  
}
