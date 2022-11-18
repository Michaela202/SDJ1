import java.util.Random;
import java.util.Scanner;
public class RandomNumber
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random randomNumbers = new Random();
    int number = randomNumbers.nextInt(11);
    System.out.println("Please try to guess a number between 1 and 10 ");
    int number1 = keyboard.nextInt();
    if(number == number1)
          System.out.println( "This is the generated number" + number + "Your guess was correct!");
      else
        System.out.println("the generated number:" + " "+  number + " " + "Your guess was incorrect! Sorry dummie");
    }
  }

