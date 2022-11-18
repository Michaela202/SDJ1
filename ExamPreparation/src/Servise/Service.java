package Servise;

public class Service
{
  private int mileage;
  private Date date;

  public Service(int mileage, Date date)
  {
    this.date = date;
    this.mileage = mileage;
  }

  public int getMileage()
  {
    return mileage;
  }

  public Date getDate()
  {
    return date;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || Object.class != obj.getClass())
    {
      return false;
    }
    Service other = (Service) obj;
    return mileage == other.mileage && date == other.date;
  }

  public String toString()
  {
    return "THIS IS THE INFO YOU NEED:" + mileage + "\n" + date;
  }


}
