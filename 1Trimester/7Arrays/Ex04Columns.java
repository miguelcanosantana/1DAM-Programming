public class Ex04Columns {
  public static void main(String[] args){
  
    int[] number = new int [20];
    int[] square = new int [20];
    int[] cube = new int [20];

    
    //"number" Random numbers
    for (int i = 0; i<=19; i++){
      number[i] = (int) (Math.random()*101); //For showing up to 100 you need 100 + 1
    }

    //"square" numbers
    for (int i = 0; i<=19; i++){
      square[i] = (int) Math.pow((number[i]), 2); //Each number of i elevated to 2
    }

    //"cube" numbers
    for (int i = 0; i<=19; i++){
      cube[i] = (int) Math.pow((number[i]), 3); //Each number of i elevated to 3
    }

  System.out.println("A table with Random numbers raised to the power of 2 and 3:");
  System.out.println("");
  System.out.printf("%-10s %-10s\n", number[0], square[0]);



  }
}

