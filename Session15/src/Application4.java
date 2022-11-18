import java.util.Scanner;

public class Application4
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int[] integers = new int[5];
    /* the long version
    System.out.println("Please insert an integer one");
    integers[0] = scanner.nextInt();
    System.out.println("Please insert an integer one");
    integers[1] = scanner.nextInt();
    System.out.println("Please insert an integer one");
    integers[2] = scanner.nextInt();
    System.out.println("Please insert an integer one");
    integers[3] = scanner.nextInt();
    System.out.println("Please insert an integer one");
    integers[4] = scanner.nextInt();*/

    //easier version
    for (int i = 0; i < integers.length; i++)
    {
      System.out.println("Please insert an integer one");
      integers[i] = scanner.nextInt();
    }
    int total = 0;
    double average;
    for (int i = 0; i < integers.length; i++)
    {
      total += integers[i];
    }
    average = total / integers.length;
    System.out.println(average);
  }
}
