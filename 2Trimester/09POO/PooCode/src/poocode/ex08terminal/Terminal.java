package poocode.ex08terminal;

public class Terminal {
  
  //Atributes (Setting them private by default)
  private String number;
  private int timeCalled = 0;
  
  //Methods
  
    //Constructor
    public Terminal(String number) {
      this.number = number;
      
    }

    //When printed shows correct data
    @Override
    public String toString() {
      return "Nº> " + number + " - " + timeCalled +"s"+ " of speaking";
    }
    

    //Telephone Calling that returns called time in total
    public int llama(Terminal number, int timeCalling){
      
      //Adds time to Number that makes a call (Cumulative)
      this.timeCalled = timeCalled + timeCalling;
      
      //Adds time to the Number that is being called (Will show later if you print it)
      number.timeCalled = timeCalling;
      
      //Return how much time the main Number has been called
      return this.timeCalled;    
    }

}
