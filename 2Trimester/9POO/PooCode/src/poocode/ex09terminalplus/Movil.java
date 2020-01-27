
package poocode.ex09terminalplus;

class Movil extends Terminal{
  private String tarifa;
  
    //Methods
  
      //Constructor
      public Movil(String number, String tarifa){
        super(number); //Super is used when you want to use something from the parent.
        this.tarifa = tarifa;
      }
      
      //Getter
      public String getTarifa() {
        return tarifa;
      }
      
      //Telephone Calling that returns call price for the caller
      public int cost(Movil number){
        
        
        
       
      }
      
  
}