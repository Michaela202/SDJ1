package Servise;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date()
  {
    day = 1;
    month = 1;
    year = 1;
  } //this is the default settings..my decision

  public void set(int day, int month, int year)
  {
    this.year = year;
    this.day = day;
    this.month = month;
  }

  public Date copy()
  {
    Date copy = new Date();
    return copy;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Date other = (Date) obj; //other==obj the (Servise.Date) is invocation to make it a proper format
    return day == other.day && month == other.month && year == other.year;
  }

  public String toString()
  {
    return day + "/" + month + "/" + year;
  }

}
