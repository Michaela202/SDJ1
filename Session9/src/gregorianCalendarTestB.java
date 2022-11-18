import java.util.Scanner;
public class gregorianCalendarTestB
{
  public static void main(String[] args)
  {
  Scanner keyboard = new Scanner(System.in);
  GregorianCalendar gregorianCalendar = new GregorianCalendar();
  int number=0;
  System.out.println("Please insert a year");
  int myInt1 = keyboard.nextInt();
  System.out.println("Please insert a second year");
  int myInt2 = keyboard.nextInt();

  for (int i = myInt1; i <= myInt2; i++)
  {
    gregorianCalendar.setYear(i);
    if(gregorianCalendar.isLeapYear())
      number++;
  }
    System.out.println("This is the number of loop years between 1582 and 2022:" + number);
}

}
