public class RoomDimension
{
  private double length;
  private double width;

  public RoomDimension(double width, double length)
  {
    this.length = length;
    this.width = width;
  }

  public double getArea()
  {
    return width * length;
  }

  public String toString()
  {
    return "This is the are:" + getArea();
  }
}
