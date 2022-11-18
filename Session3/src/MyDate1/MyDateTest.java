package MyDate1;

public class MyDateTest
{
  public static void main( String[] args){
    MyDate first = new MyDate();
    MyDate second = new MyDate();

    first.setDay(22);
    first.setMonth(12);
    first.setYear(2002);
    second.setDay(20);
    second.setMonth(9);
    second.setYear(2002);
    System.out.println(first.displayDate());

    System.out.println(second.displayDate());
  }
}
