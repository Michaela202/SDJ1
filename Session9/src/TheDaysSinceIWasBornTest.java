public class TheDaysSinceIWasBornTest
{
  public static void main(String[] args){
    TheDaysSinceIWasBorn number =new TheDaysSinceIWasBorn(22, 12, 2002);
   TheDaysSinceIWasBorn number2 =new TheDaysSinceIWasBorn(19,9,2022);
    int num =0;
   while(!(number.getDay()==number2.getDay() && number.getMonth()==number2.getMonth()&& number.getYear()==number2.getYear())) //
   {                                                      // String comparison of numbers
     number.nextDay();
     //System.out.println(number);
     num++;
   }
    System.out.println(num); //sout
    }
}
