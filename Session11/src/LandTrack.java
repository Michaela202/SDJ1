public class LandTrack
{
  private double width;
  private double length;

  public LandTrack(double width, double length)
  {
    this.width = width;
    this.length = length;
  }

  public static double area(double width, double length)
  {
    return width * length;
  }

  public String toString()

  {
    return "width+ " + width + "length" + length;
  }

  public boolean equals(LandTrack obj)
  {
    if (area(width, length) == area(obj.width, obj.length))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
