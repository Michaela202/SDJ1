public class SwichMyDateAgainTest
{
  public static void main(String[] args)
  {
    SwichMyDateAgain first = new SwichMyDateAgain(19,9,2002);
    System.out.println(first.toString());
    System.out.println(first.isLeapYear());
    System.out.println(first.daysInMonth());
    System.out.println(first.getAstroSign());
    System.out.println(first.getMonthName());


  }
}

