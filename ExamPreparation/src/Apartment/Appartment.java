package Apartment;

public class Appartment
{
  private int number;
  private Tenant tenant;

  public Appartment(int number)
  {
    this.number = number;
    this.tenant = null;
  }

  public int getNumber()
  {
    return number;
  }

  public boolean isAvailable()
  {
    if (tenant == null)
    {
      return true;
    }
    else
      return false;
  }

  public void rentTo(Tenant tenant, MyDate myDate)
  {
    this.tenant= tenant;

  }

}
