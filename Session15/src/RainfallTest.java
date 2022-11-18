import java.util.Scanner;

public class RainfallTest
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    double[] array = new double[12];
    for (int i = 0; i < array.length; i++)
    {
      System.out.println("Please insert a double");
      /*if(scanner.nextDouble()<0)
       System.out.println("ERROR");
      else*/
      array[i] = scanner.nextDouble();
    }

    Rainfall r = new Rainfall(array);

    System.out.println(r.getTotal());
    System.out.println(r.getAverage());
    System.out.println(r.getMax());
    System.out.println(r.getMin());

  }
}
