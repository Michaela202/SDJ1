public class Geometry
{

  public static double area(double radius)
  {
    if (radius > 0.0)
    {
      return Math.pow(radius, 2) * Math.PI;
    }
    else
      return 0.0;
  }

  public static double area(double width, double lenght)
  {
    if (width > 0.0 || lenght > 0.0)
    {
      return lenght * width;
    }
    else
      return 0.0;
  }

  public static double area(double width, double height, double lenght)
  {
    if (width > 0.0 || height > 0.0 || lenght > 0.0)
    {
      return width * lenght * height * 0.5;
    }
    else
      return 0.0;
  }

}
