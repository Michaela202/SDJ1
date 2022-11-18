public class ShapesTest
{
  public static void main(String[] args)
  {
    TwoDimensionalShape[] shapes = new TwoDimensionalShape[3];
    shapes[0] = new Rectangle(5, 5, 10, 10);
    shapes[1] = new Circle(5, 5, 15);
    shapes[2] = new Circle(10, 10, 20);
    for (int i = 0; i < shapes.length; i++)
    {
      System.out.println(shapes[i]);
    }
  }
}
