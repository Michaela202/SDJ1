public class Point
{
  private double x;
  private double y;

  public Point(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  public void move(double dx, double dy)
  {
    this.x += dx;
    this.y += dy;
  }

  public Point copy()
  {
    Point copy = new Point(x, y);
    return copy;
  }

  public String toString()
  {
    return "(" + x + "," + y + ")";
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Point other = (Point) obj;
    return x==other.x && y== other.y;
  }
}
