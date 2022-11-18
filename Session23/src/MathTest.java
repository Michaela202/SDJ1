import java.util.Scanner;

public class MathTest
{
  public static void main(String[] args)

  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter x: ");
    int x = scanner.nextInt();

    System.out.println("Enter y: ");
    int y = scanner.nextInt();

    System.out.println("x * y = " + (x * y));
    System.out.println("x +y =" + (x + y));
    try
    {
      System.out.println("x - y = " + (x / y));
    }
    catch (java.lang.ArithmeticException e) //AritmeticExeption je vbudovana metoda
    {
      System.err.println(e.getMessage()); // err preto je to cervene; getMessege je metoda z aritmeticException class
    }


    System.out.println("x - y = " + (x - y));
  }
}

