public class SportsCar extends Car
{
  private int maxVelocity;

  public SportsCar(String owner, double price, String regNo, int maxVelocity)
  {
    super(owner, price, regNo);
    this.maxVelocity = maxVelocity;
  }

  public String toString()
  {
    return "INFO ABOUT SPORTSCAR" + getOwner() + "\n" + getPrice() + "\n"
        + getRegistrationNumber() + "\n" + maxVelocity;
  }
}
