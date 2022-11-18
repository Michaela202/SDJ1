public class Circle
{
  private double radius;
  private Point center;

  public Circle(double x, double y, double radius)
  {
    this.radius = radius;
    this.center = new Point(x, y);

  }

  public Point getCenter()
  {
    center.copy();
    return center;
  }

  public double getRadius()
  {
    return radius;
  }

  public void moveCircle(double dx, double dy)
  {
    center.move(dx, dy);
  }

  public double getArea()
  {
    return Math.PI * Math.pow(radius, 2);
  }

  public String toString()
  {
    return "INFO:" + "\n" + center + "\n" + radius;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Circle other = (Circle) obj;
    return radius==other.radius && center==other.center;
  }

}
