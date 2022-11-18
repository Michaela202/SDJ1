public class MyDateAgainTest
{
  public static void main(String[] args)
  {
    MyDateAgain first = new MyDateAgain(22,12,2002);
    System.out.println(first.toString());
    System.out.println(first.isLeapYear());
    System.out.println(first.daysInMonth());
    System.out.println(first.getAstroSign());


  }
}

