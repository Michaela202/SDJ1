import java.util.Scanner;

public class GeometryTest
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int x;
    do
    {
      System.out.println("1. Calculate the Area of a Circle");
      System.out.println("2. Calculate the Area of a Rectangle");
      System.out.println("3. Calculate the Area of a Triangle");
      System.out.println("4.Quit");
      System.out.println(" Enter your choice");
      x = scanner.nextInt();

      switch (x)
      {
        case 1:
          System.out.println(Geometry.area(5));
        case 2:
          System.out.println(Geometry.area(15, 58));
        case 3:
          System.out.println(Geometry.area(18, 15, 55));

      }
      if(x>4 || x<1){
        System.out.println("ERROR");
      }

    }
    while (x<4 && x>0) ;
  }
}
