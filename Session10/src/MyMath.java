import java.text.DecimalFormat;
import java.util.Scanner;

public class MyMath
{
  public static void main(String[] agrs)
  {
    Scanner scanner = new Scanner(System.in);
   // System.out.println("How many times should the loop run?");
  //  int input = scanner.nextInt();
   /* double bracket = 1;
    int counter = 1;


  do
    {
      counter++;
      //z = z + ((-1) * Math.pow(-1, n) / (2 * n - 1));
      bracket = bracket + ((-1) * Math.pow(-1, counter)/ (2 * counter - 1));
    }
    while(counter<input);
    System.out.println(bracket*4);*/

    double pi = 1;
    int div = 3;

    DecimalFormat f = new DecimalFormat("0.00000");
    String realPi = f.format(Math.PI);
int i = 0;
   while (!f.format(4*pi).equals(realPi))
    {
      if (i % 2 == 0)
      {
        pi = pi - 1.0 / div;
      }
      else
      {
        pi = pi + 1.0 / div;
      }

      div+=2;
      i++;
    }
    System.out.println(i);


    /*for (int i = 0; i < input; i++)
    {
      if (i % 2 == 0)
      {
        pi = pi - 1.0 / div;
      }
      else
      {
        pi = pi + 1.0 / div;
      }

      div+=2;
    }*/
    System.out.println(f.format(4*pi));
  }

}
