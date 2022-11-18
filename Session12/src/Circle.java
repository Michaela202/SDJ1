public class Circle
{
  private double radius;

  private double getArea()
  {
    return Math.PI * radius * radius;
  }

  public double getRadius()
  {
    return radius;
  }

  public Circle()
  {
    radius = 0;
  }

  public Circle(double radius)
  {
    this.radius = radius;
  }

  public String toString()
  {
    return "The area of the circle:" + radius + "/n" + "The radius:" + radius;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Circle other = (Circle) obj;
    return radius == other.radius;
  }

  public boolean graterThan(Circle obj)
  {
    if(getArea()> obj.getArea())
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}