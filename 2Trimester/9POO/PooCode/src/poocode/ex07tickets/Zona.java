package poocode.ex07tickets;


public class Zona {
  
  private int entradasPorVender;
  
  public Zona(int n){
  entradasPorVender = n;
  }
  
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  
  /**
  * Sells a number of tickets.
  * Checks if there are any tickets available before selling.
  *
  * @param n number of tickets to sell.
  */
  
  public void vender(int n) {
    
    if (this.entradasPorVender == 0) {
        System.out.println("There are not any tickets for this zone available.");
    
    } else if (this.entradasPorVender < n) {
      System.out.println("Only " + this.entradasPorVender + " tickets left for this zone.");
    
    }
    
    
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Here you have " + n + " tickets, Thank You.");
    }
  }
}