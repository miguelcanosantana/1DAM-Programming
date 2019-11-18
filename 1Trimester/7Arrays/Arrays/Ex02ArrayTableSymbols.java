public class Ex02ArrayTableSymbols {
  public static void main(String[] args){
  /*
    This way is an alternative

    char[] simbolo = {'a', 'x', '', '', '@','',' ','+','Q',''};

  */

  char[] simbolo = new char[10];

  simbolo[0] = 'a';
  simbolo[1] = 'x';
  simbolo[4] = '@';
  simbolo[6] = ' ';
  simbolo[7] = '+';
  simbolo[8] = 'Q';
    

    for (int i = 0; i <= 9; i++){
      System.out.print(simbolo[i] + " ");
    }
  }
}

