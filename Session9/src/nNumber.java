import java.util.Scanner;
public class nNumber
{
  public static void main(String[] agrs)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please insert a number");
    int myIntone = keyboard.nextInt();
    for(int i = 1; i <= myIntone; i++ )
    {
      System.out.print(i);
    }
    //b
    for(int k = 1; k <= myIntone; k++ )
    {
      System.out.print(k);
      //c
      for(int j = 1; j <= myIntone; j++ )
      {
        System.out.print(j);
      }
    }
  }
}
