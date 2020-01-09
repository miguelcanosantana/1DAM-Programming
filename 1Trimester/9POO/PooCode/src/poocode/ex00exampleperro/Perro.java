package poocode.ex00exampleperro;

public class Perro {
  // Atributos (Características)
  String color;
  String sexo;
  String raza;
  int edad;
  String nombre;
  String numeroChip;
  
  
  // Métodos (Comportamientos)

    //Tengo Perro al que le paso un nombre
    public Perro(String n) {
      this.nombre = n;
    }
    
    //Tengo Perro Anónimo
    public Perro() {
      this.nombre = null;
    }

    //El perro dice su nombre y ladra
    void ladra(){
      if (this.nombre == null) {
        System.out.println("Soy un perro anónimo");
      } else {
        System.out.println("Soy " + this.nombre);
      }
    System.out.println("*BARKS*...");
    }
    public String getNombre() {
      return nombre;
    }

}



