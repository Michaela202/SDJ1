import java.util.Scanner;

public class Ex1506
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int[] array1 = new int[4];
    for (int i = 0; i < array1.length; i++)
    {
      System.out.println("Please insert an integer");
      array1[i] = scanner.nextInt();
    }
    int[] array2 = new int[4];
    for (int i = 0; i < array2.length; i++)
    {
      System.out.println("Please insert an integer one");
      array2[i] = scanner.nextInt();
    }
    int[] sumArray = new int[array1.length];
    int sum = 0;
    for (int i = 0; i < array2.length; i++)
    {
      sum = array1[i] + array2[i];
      System.out.println(sum);
    }
  }
}
