
package poocode.ex09terminalplus;

class Movil extends Terminal{
  private String rate;
  
    //Methods
  
      //Constructor
      public Movil(String number, String rate){
        super(number); //Super is used when you want to use something from the parent.
        this.rate = rate;
      }
      
      //Getter
      public String getRate() {
        return rate;
      }
      
      //Telephone Calling that returns call price for the caller
      public int cost(Movil number){
        
        String rateName = number.getRate();
        double costRatePerMin;
        int minutes;
        double finalRateCost;
        
        //Rates' price
        if (rateName.equals("rata")){
          costRatePerMin = 0.06;  
        }
        
        if (rateName.equals("mono")){
          costRatePerMin = 0.12;  
        }        

        if (rateName.equals("bisonte")){
          costRatePerMin = 0.30;  
        }
        
        minutes = (int) ((number.getTimeCalled())/60);
        finalRateCost = minutes * costRatePerMin;
        
        return costRatePerMin;
        //FIX NON INITIALIZED  
        
      }
      
  
}