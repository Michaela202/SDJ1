import java.util.Scanner;
public class SortNumbers
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    /*
    System.out.println("Please insert two random whole numbers");
    int numberone = keyboard.nextInt();
    int numbertwo = keyboard.nextInt();

    if( numberone>numbertwo)
    {
      System.out.println(numberone);
    }
    if (numberone>numbertwo)
    {
      System.out.println(numbertwo + " " + numberone);
    }
    */
    // this is the b) of exercise 6.04


    System.out.println("Please insert three random whole numbers");
    int number1 = keyboard.nextInt();
    int number2 = keyboard.nextInt();
    int number3 = keyboard.nextInt();
    //not a nice way to do but the only one I know so far//
    if (number1 < number2 && number2 < number3)
      System.out.println(number1 + " " + number2 + " " +number3);
    if (number1 < number3 && number3 < number2)
      System.out.println(number1 + " " + number3 + " " +number2);
    if (number2 < number1 && number1 < number3)
      System.out.println(number2 + " " + number1 + " " +number3);
    if (number2 < number3 && number3 < number1)
      System.out.println(number2 + " " + number3 + " " +number1);
    if (number3 < number1 && number1 < number2)
      System.out.println(number3 + " " + number1 + " " +number2);
    if (number3 < number2 && number2 < number1)
      System.out.println(number3 + " " + number2 + " " +number1);

    {

    }
  }
}
