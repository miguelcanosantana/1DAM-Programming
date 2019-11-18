import java.util.Scanner;

public class TestArray {
  public static void main(String[] args){
  
    double[] temperaturas = new double [5];
    Scanner s = new Scanner(System.in);
    
    //Pide los datos al usuario
    System.out.println("Introduzca a continuación 5 temperaturas");
    for (int i = 0; i<5; i++){
      temperaturas[i] = Double.parseDouble(s.nextLine());
    }
    
    System.out.println();
    
    //Muestra el contenido del array
    for (double t : temperaturas){ //No modificar el array en el mismo bucle que está.
      System.out.println(t);
    }

  }
}

