import java.util.Scanner;

public class workbench1
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int product;
    do
    {
      System.out.println("Please insert a number");
      int input = scanner.nextInt();
      product = input * 10;

    }
    while(product<100);
    System.out.println("You have written a number which multiplication by 10 reached a number higher then 100.");
  }
}