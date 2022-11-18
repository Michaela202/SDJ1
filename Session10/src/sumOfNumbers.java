import java.util.Scanner;

public class sumOfNumbers
{
  public static void main(String[] args)
  {
    int total =0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert a nonzero integer");
    int input = scanner.nextInt();
    for (int i = 1; i <= input; i++)
    {
      total+=i;
    }
    System.out.println("The result of this wonderful thing is:" + total);
  }
}
