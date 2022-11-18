import java.util.Scanner;
public class GregorianCalendarTest
{
  public static void main(String[] args)
  {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();
    int number=0;
    for (int i = 1582; i <= 2022; i++)
    {

      gregorianCalendar.setYear(i);
      if(gregorianCalendar.isLeapYear())
        number++;
    }
    System.out.println("This is the number of loop years between 1582 and 2022:" + number); // this has to be outside of the loop


        /* Scanner keyboard = new Scanner(System.in);
    System.out.println("Please insert a number");
    int myIntone = keyboard.nextInt(); */

  }

  }


