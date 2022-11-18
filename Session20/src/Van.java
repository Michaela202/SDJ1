public class Van extends Car
{
  private int maxLoad;

  public Van(String owner, double price, String regNo, int maxLoad)
  {
    super(owner, price, regNo);
    this.maxLoad = maxLoad;
  }

  public int getMaxLoad()
  {
    return maxLoad;
  }

  public String toString()
  {
    return "INFO ABOUT VAN:" + getOwner() + "\n" + getPrice() + "\n"
        + getRegistrationNumber() + "\n" + maxLoad;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Van other=(Van) obj;
    return super.equals(other) && maxLoad== other.maxLoad;
  }
}
