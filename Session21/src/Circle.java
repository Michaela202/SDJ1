public class Circle extends TwoDimensionalShape
{
  private double radius;

  public Circle(double x, double y, double radius)
  {
    super(x, y);
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public double getArea()
  {
    return radius * radius * Math.PI;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Circle other = (Circle) obj;
    return getX() == other.getX() && getY() == other.getY()
        && getArea() == other.getArea();
  }

  public String toString()
  {
    return "INFO:" + getY() + "\n y:" + getX() + "\n x:" + getArea();
  }
}
