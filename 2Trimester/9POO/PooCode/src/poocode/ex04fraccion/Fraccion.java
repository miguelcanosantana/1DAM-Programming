package poocode.ex04fraccion;


public class Fraccion {
  
  //Attributes
  int numerador;
  int denominador;
  
  
  //Methods
  
    //Reads numerator and denominator
    public Fraccion(int numeradorNumber, int denominadorNumber) {
      this.numerador = numeradorNumber;
      this.denominador = denominadorNumber;
    }
    
    //Getters
    public int getNumerador() {
      return numerador;
    }

    public int getDenominador() {
      return denominador;
    }
    
    //Invert
    public Fraccion inverts(int numerador, int denominador){
      numerador = getDenominador();
      denominador = getNumerador();
      return new Fraccion(numerador, denominador);
    }
    
  
}
