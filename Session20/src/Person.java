public class Person
{
  private String name;
  private String address;
  private String telNo;

  public Person(String name, String addr, String telNo)
  {
    this.name = name;
    this.address = addr;
    this.telNo = telNo;
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

  public void setTelNo(String telNo)
  {
    this.telNo = telNo;
  }

  public String getTelNo()
  {
    return telNo;
  }

  public String toString()
  {
    return "Name: " + name + ", Address: " + address + ", TELEPHONE NUMBER:"
        + telNo;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }

    Person other = (Person) obj;

    return name.equals(other.name) && address.equals(other.address)
        && telNo.equals(other.telNo);
  }
}
