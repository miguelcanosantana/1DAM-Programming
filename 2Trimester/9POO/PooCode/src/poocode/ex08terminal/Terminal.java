package poocode.ex08terminal;

public class Terminal {
  
  //Atributes
  private String number;
  private int timeCalled = 0;
  
  //Methods
  
    //Constructor
    public Terminal(String number) {
      this.number = number;
      
    }

    @Override
    public String toString() {
      return "Nº> " + number + " - " + timeCalled +"s"+ " of speaking";
    }
    
    
    //Getters
    public String getNumber() {
      return number;
    }

    public int getTimeCalled() {
      return timeCalled;
    }
  

    //Telephone Calling that returns called time in total
    public int llama(Terminal number, int timeCalling){
      
      //Number that makes a call
      this.timeCalled = timeCalled + timeCalling;
      
      //Number that is being called
      number.timeCalled = timeCalled + timeCalling;
      
      return this.timeCalled;
      
      
    }


  
  
}
