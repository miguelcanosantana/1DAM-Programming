
package poocode.ex09terminalplus;

class Movil extends Terminal{
  private String tarifa;
  
    //Methods
  
      //Constructor
      public Movil(String number, String tarifa){
        super(number); //Super is used when you want to use a method from the parent.
        this.tarifa = tarifa;
      }     
  
}