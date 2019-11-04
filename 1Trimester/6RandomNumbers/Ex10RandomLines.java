public class Ex10RandomLines {
   public static void main(String[] args) {
     System.out.println("This program will print 10 random lines with one random character for each line");
    int ranChar = 0;
    int charPerLine = 0;
    String Char = "0";

    for (int lines = 10; lines > 0; lines--){
      ranChar= (int)(Math.random()*7);
      charPerLine= (int)(Math.random()*41);

      switch(ranChar){
        case 0:
        Char = "*";
        break;

        case 1:
        Char = "-";
        break;

        case 2:
        Char = "=";
        break;

        case 3:
        Char = ".";
        break;

        case 4:
        Char = "|";
        break;

        case 5:
        Char = "@";
        break;
      }

      while(charPerLine > 0){
        System.out.print(Char);
        charPerLine--;
      }
      
    System.out.println("");
    }
  }
}
