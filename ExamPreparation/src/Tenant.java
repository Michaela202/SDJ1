public class Tenant
{
  private String name;
  private MyDate myDate; //should be called RentedFrom

  public Tenant(String name)
  {
    this.name = name;
    this.myDate = myDate.copy(); //is this solving all my problems or should I do it separately ?
  }

  public String getName()
  {
    return name;
  }

  public MyDate getRentedFrom()
  {
    return myDate;
  }

  public void setRentedFro(MyDate date)
  {
    this.myDate = myDate;
  }

  public boolean equals(Object obj)
  {
    if (obj == null && getClass() != obj.getClass())
    {
      return false;
    }
    Tenant other = (Tenant) obj;
    return myDate == other.myDate && name.equals(other.name);
  }

  public String toString()
  {
    return "NAME:" + name + "RENTED FROM:" + myDate;
  }
}
