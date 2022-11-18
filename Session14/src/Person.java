public class Person
{
  private String name;
  private String address;
  private MyDate11 birthday;
  private Brain brain;
  private Address shortAddress;

  public Person(String name, String address, MyDate11 birthday)
  {
    this.birthday = birthday;
    this.name = name;
    this.address = address;
    this.brain = new Brain();
  }

  public Person(String name, MyDate11 birthday)
  {
    this.name = name;
    address= "";
    this.birthday = birthday;
    this.brain = new Brain();
  }

  public Person(MyDate11 birthday)
  {
    name ="";
    address= "";
    this.birthday = birthday;
    this.brain =new Brain();
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

  public Address getShortAddress()
  {
    return shortAddress;
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
   int age = today.getYear() - birthday.getYear();
    if (today.getMonth() < birthday.getMonth() || (
        today.getMonth() == birthday.getMonth()
            && today.getDay() < birthday.getDay()))
    {
      return age - 1;
    }
    else
      return age;
  }

  public int getIQ()
  {
    return brain.getIQ();
  }

  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic)
  {
    if (brain.recall(topic))
    {
      return true;
    }
    else
      return false;

  }

  public void rememberThis(String topic)
  {
    if (doYouRemember(topic))
    {
      brain.refreshMemory(topic);

    }
    else
      brain.remember(topic);
  }

  public String whatAreYouThinkingAbout()
  {
    return brain.recall();
  }

  public String toString() //probably add stuff
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
