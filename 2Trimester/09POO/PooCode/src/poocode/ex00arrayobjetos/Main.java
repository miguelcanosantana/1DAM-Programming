package poocode.ex00arrayobjetos;
import java.util.Scanner;


public class Main {
  public static void main (String[] args){
    final int N = 4;
    
    Scanner s = new Scanner(System.in);
    
    //Crea el Array (Estructura de celdas)
    Alumno[] dam1 = new Alumno[4];
    
    
    //Añade datos al Array (Estructura de celdas)
    for (int i = 0; i < 4; i++) {
      dam1[i] = new Alumno();
      
    }
    
    //Pide los nombres
    System.out.println("Introduzca los " + N + " nombres, mientras pulsa intro: ");
    
    for (int i = 0; i < N; i++) {
      dam1[i].setNombre(s.nextLine());
    }
    
    for (int i = 0; i < N; i++) {
      System.out.print(dam1[i].getNombre() + ", introduce tu nota: ");
      dam1[i].setNotaMedia(Double.parseDouble(s.nextLine()));
      
    }
    
    
    //Lee el Array (Celdas)   
    for (Alumno alumno : dam1) {
      System.out.println(alumno);    
    } 
    
    
    
    
    
    
    
    
    
    
    

    
    Alumno al = new Alumno();
    al.setNombre ("Pepe Pérez");
    al.setNotaMedia (6.5);
    

    
    
    
    
    
    
  }
  
}
