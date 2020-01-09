package poocode.ex00gatosapareados;

public class Gato {
  // Atributos (Características)
    String sexo;
    String nombre;
  
  
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
    
    //Setter de nombre
    public void setNombre(String n) {
      this.nombre = n;
    }
    
    //Setter de sexo
    public void setSexo(String s) {
      this.sexo = s;
    }
    
    //Getter de nombre
    public String getNombre() {
      return nombre;
    }
    
    //Getter de sexo
    public String getSexo() {
      return sexo;
    }
    
    //Aparear
    public String aparea(Gato g){
      if ((this.sexo.equals(g.getSexo()))){
        System.out.println("Dos gatos de un mismo sexo no se pueden aparear");
        return "NOgatito";
      } else {
        System.out.println("Los gatos han tenido un gatito :3");
        return "gatito";
      }
      
      
    }

        
      


    
    
    
    
}
