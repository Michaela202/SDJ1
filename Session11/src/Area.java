public class Area
{

  public  static double shape(double radius)
  {
    return Math.pow(radius, 2) * Math.PI; //rasing readius to the power of two
  }

  public static int shape(int width, int length)

  {
    return width*length;
  }
  public  static double shape(int radius, double pi, int h )
  {
    return Math.PI * Math.pow(radius, 2) * h;
  }
}
