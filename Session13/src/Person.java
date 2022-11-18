public class Person
{
  private String name;
  private String address;
  private MyDate11 birthday;
  private int age;

  public Person(String name, String address, MyDate11 birthday)
  {
    this.birthday = birthday;
    this.name = name;
    this.address = address;
  }

  public Person(String name, MyDate11 birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }

  public Person(MyDate11 birthday)
  {
    this.birthday = birthday;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public MyDate11 getBirthday()
  {
    return birthday;
  }

  public int age()
  {
    MyDate11 today = new MyDate11();
    age = today.getYear() - birthday.getYear();
    if (today.getMonth() < birthday.getMonth()
        || (today.getMonth() == birthday.getMonth()
        && today.getDay() < birthday.getDay()))
    {
      return age - 1;
    }
    else
      return age;
  }

  public String toString()
  {
    return "This is" + name + ", he/she lives at" + address
        + "her/his birthday is " + birthday + " and her/his current age is "
        + age();
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Person other = (Person) obj;
    return name == other.name && birthday == other.birthday
        && address == other.address;
  }
}
