import java.time.LocalDate;

public class MyDate11
{
  private int day;
  private int month;
  private int year;

  public MyDate11(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;

  }

  public MyDate11(MyDate11 obj)
  {
    day = obj.day;
    month = obj.month;
    year = obj.year;

  }

  public MyDate11()
  {
    LocalDate currentDate = LocalDate.now();
    day = currentDate.getDayOfMonth();
    month = currentDate.getMonthValue();
    year = currentDate.getYear();
  }

  public int getDay()
  {
    return day;
  }

  public void setDay(int day)
  {
    this.day = day;
  }

  public int getMonth()
  {
    return month;
  }

  public void setMonth(int month)
  {
    this.month = month;
  }

  public int getYear()
  {
    return year;
  }

  public void setYear(int year)
  {
    this.year = year;
  }

  public boolean isLeapYear()
  {
    if (year % 400 == 0)
    {
      return true;
    }

    else if (year % 4 == 0 && year % 100 != 0)
    {
      return true;

    }
    else
      return false;
  }

  public int daysInMonth()
  {
    if (month == 1)
      return 31;
    else if (month == 2)
      if (isLeapYear())
        return 29;
      else
        return 28;
    else if (month == 3)
      return 31;
    else if (month == 4)
      return 30;
    else if (month == 5)
      return 31;
    else if (month == 6)
      return 30;
    else if (month == 7)
      return 31;
    else if (month == 8)
      return 31;
    else if (month == 9)
      return 30;
    else if (month == 10)
      return 31;
    else if (month == 11)
      return 30;
    else if (month == 12)
      return 31;
    else
      return 0;
  }

  public String getAstroSign() //it has to return a String
  {
    if ((month == 1 && day >= 20) || (month == 2 && day <= 18))
      return ("Aquarius");
    if ((month == 3 && day >= 21) || (month == 4 && day <= 19))
      return ("Aries");
    if ((month == 4 && day >= 20) || (month == 5 && day <= 20))
      return ("Taurus");
    if ((month == 5 && day >= 21) || (month == 6 && day <= 20))
      return ("Gemini");
    if ((month == 6 && day >= 21) || (month == 7 && day <= 22))
      return ("Cancer");
    if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
      return ("Leo");
    if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
      return ("Virgo");
    if ((month == 9 && day >= 23) || (month == 10 && day <= 22))
      return ("Libra");
    if ((month == 10 && day >= 23) || (month == 11 && day <= 21))
      return ("Scorpio");
    if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
      return ("Sagittarius");
    if ((month == 12 && day >= 22) || (month == 1 && day <= 19))
      return ("Capricorn");
    if ((month == 2 && day >= 19) || (month == 3 && day <= 20))
      return ("Pisces");
    else
      return ("ERROR");
  }
  //dayOfWeek look at it properly


  //exercise 8.02
  public String getMonthName() //only print out in the main method, USE return!!!
  {
    switch (month)
    {
      case 1:
        return ("January");
      case 2:
        return ("February");

      case 3:
        return ("March");

      case 4:
        return ("April");

      case 5:
        return ("May");

      case 6:
        return ("June");

      case 7:
        return ("July");

      case 8:
        return ("August");

      case 9:
        return ("September");

      case 10:
        return ("October");

      case 11:
        return ("November");

      case 12:
        return ("December");

      default:
        return ("ERROR");

    }

    //exercise 7.05

  }

  public void nextDay() //void becouse it doesnt return stuff
  {
    if (day == daysInMonth())
    {
      day = 1;
      if (month == 12)
      {
        month = 1;
        year++;
      }
      else
        month++;
    }
    else
      day++;
  }

  public void nextDays(int days)
  {
    for (int i = 0; i < days; i++)
    {
      nextDay();
    }
    //just multiply the nextDay method... use loops to make it easy
  }

  public boolean idBefore(MyDate11 date2)
  {
    if (year < date2.year)
    {
      return true;
    }
    else if (year == date2.year && month < date2.month)
    {
      return true;
    }
    else if (year == date2.year && month == date2.month && day < date2.day)
    {
      return true;
    }
    else
    {
      return false;
    }

  }

  public static MyDate11 today() // this connects the information from the MyDate class
  {
    return new MyDate11(); //this calls the constructor
  }

  public String toString()
  {
    return day + "/" + month + "/" + year;
  }

  public MyDate11 copy()
  {
    return new MyDate11(day, month, year);
  }
  /*public boolean equals(MyDate11 obj)
  {
    if (day == obj.day && month == obj.month && year == obj.year)
    {
      return true;
    }
    else
    {
      return false;
    }
  }*/

  //12.01 ..rewrite of the 11.01
  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    MyDate11 other = (MyDate11) obj;
    return day == other.day && month == other.month && year == other.year;
  }

  //11.04
}