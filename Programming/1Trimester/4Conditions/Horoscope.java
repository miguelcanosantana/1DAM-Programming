public class Horoscope{
  public static void main(String[] args) {
  
    System.out.println("This is the Horoscope, let's know your sign!");
    System.out.print("Please input the month you were born: ");
    int month = Integer.parseInt(System.console().readLine());
    
    System.out.print("Now the day: ");
    int day = Integer.parseInt(System.console().readLine());
    String horoscope = "";
    switch (month){

      case 1:
      if(day<21){
        horoscope="capricorn";
      }else{
        horoscope="aquarius";
        }
      break;

      case 2:
      if(day<20){
        horoscope="aquarius";
        }else{
          horoscope="pisces";
      }
      break;

      case 3:
      if(day<21){
        horoscope="pisces";
        }else{
          horoscope="aries";
      }
      break;

      case 4:
      if(day<21){
        horoscope="aries";
        }else{
          horoscope="taurus";
      }
      break;

      case 5:
      if(day<20){
        horoscope="taurus";
        }else{
          horoscope="gemini";
      }
      break;

      case 6:
      if(day<22){
        horoscope="gemini";
        }else{
          horoscope="cancer";
      }
      break;

      case 7:
      if(day<22){
        horoscope="cancer";
        }else{
          horoscope="leo";
      }
      break;

      case 8:
      if(day<24){
        horoscope="leo";
        }else{
          horoscope="virgo";
      }
      break;

      case 9:
      if(day<24){
        horoscope="virgo";
        }else{horoscope="libra";
      }
      break;

      case 10:
      if(day<24){
        horoscope="libra";
        }else{
          horoscope="scorpio";
      }
      break;

      case 11:
      if(day<23){
        horoscope="scorpio";
        }else{
          horoscope="sagittarius";
      }
      break;

      case 12:
      if(day<21){
        horoscope="sagittarius";
        }else{
          horoscope="capricorn";
      }
      break;

      default:
      System.out.print("Input valid numbers please.");

    }

    System.out.print("Your horoscope is " + horoscope + ".");

  }
}
