public class Book
{
  String title;
  int year;

  public Book(String title, int year)
  {
    this.title = title;
    this.year = year;
  }

  public String getTitle()
  {
    return title;
  }

  public int getYear()
  {
    return year;
  }

  public String toString()
  {
    return "Title:" + title + "\n" + "Year:" + year;
  }

  public boolean equals(Book obj)
  {
    if (toString().equals(obj.toString()))
    {
      return true;

    }
    else
      return false;
  }
}
