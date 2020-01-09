package poocode.ex00gatosapareados;
  
public class Gatera {
  
  public static void main(String[] args){
    // Gatos machos
    Gato g1 = new Gato("Fantasma");
    Gato g2 = new Gato("Pitipu");
    Gato g3 = new Gato("Tirion");
    
    g1.setSexo("Macho");
    g2.setSexo("Macho");
    g3.setSexo("Macho");
    
    // Gatos hembra
    Gato g4 = new Gato("Poppy");
    Gato g5 = new Gato("Penny");
    Gato g6 = new Gato("Elsa");
    
    g4.setSexo("Hembra");
    g5.setSexo("Hembra");
    g6.setSexo("Hembra");
    
    // Aparear
    Gato apareamiento1 = new Gato  ("g" + (int) (Math.random()*6+1));
    Gato apareamiento2;
     
    //Comprueba que no se aparee consigo mismo
    do{
      apareamiento2 = new Gato ("g" + (int) (Math.random()*6+1));   
      }while (apareamiento2.equals(apareamiento1));
    
      apareamiento1.aparea.(apareamiento2);
    
    
    
    
    
  }
  
}
