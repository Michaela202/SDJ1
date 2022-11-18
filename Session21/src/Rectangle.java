public class Rectangle extends TwoDimensionalShape
{
  private double width;
  private double length;

  public Rectangle(double x, double y, double width, double length)
  {
    super(x, y);
    this.width = width;
    this.length = length;
  }

  public double getWidth()
  {
    return width;
  }

  public void setWidth(double width)
  {
    this.width = width;
  }

  public double getLength()
  {
    return length;
  }

  public void setLength(double length)
  {
    this.length = length;
  }

  public double getArea()
  {
    return width * length;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Rectangle other = (Rectangle) obj;
    return getX() == other.getX() && getY() == other.getY()
        && getArea() == other.getArea() && width == other.width
        && length == other.length;
  }

  public String toString()
  {
    return "INFO:" + "\n x:" + getX() + "\n y" + getY() + "\n area" + getArea()
        + "\n width" + width + "\n lenght" + length;
  }
}
