public class CharChain {
  public static void main(String[] args){
/*  char l = 'L';
    char i = 'i';
    char m = 'm';
    char o = 'ó';
    char n = 'n';
  
    String all = l + i + m + o + n;
  
    System.out.println(all);
    
    //CharChain.java:9: error: incompatible types: int cannot be converted to String 

*/
    //Fix
    char l = 'L';
    char i = 'i';
    char m = 'm';
    char o = 'ó';
    char n = 'n';
    //Add space before any letters
    String all = "" + l + i+ m + o + n;
  
    System.out.println(all);
  }
}
 

