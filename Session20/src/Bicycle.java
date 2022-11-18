public class Bicycle extends Vehicle
{
  private int gears;

  public Bicycle(String owner, double price, int gears)
  {
    super(owner, price);
    this.gears = gears;
  }

  public int getGears()
  {
    return gears;
  }

  public void setGears()
  {
    this.gears = gears;
  }

  public String toString()
  {
    return "BICYCLE INFO:" + getOwner() + "\n" + getPrice() + "\n" + gears;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Bicycle other = (Bicycle) obj;
    return super.equals(other) && gears==other.gears;
  }
}
