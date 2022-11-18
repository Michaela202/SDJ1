public class Address
{
  private String street;
  private String number;
  private String postalCode;
  private String city;
  private String country;

  public Address(String st, String no, String pc, String ci, String co)
  {
    this.street = st;
    this.number = no;
    this.postalCode = pc;
    this.city = ci;

  }

  public void setAddress(String st, String no, String pc, String ci, String co)
  {
    this.street = st;
    this.number = no;
    this.postalCode = pc;
    this.city = ci;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getStreet()
  {
    return street;
  }

  public String getNumber()
  {
    return number;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getCountry()
  {
    return country;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public String toString()
  {
    return "Information:" + "\n" + getCity() + "\n" + getCountry() + "\n"
        + getNumber() + "\n" + getStreet() + "\n" + getPostalCode();
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Address other = (Address) obj;
    return city == other.city && country == other.country
        && number == other.number && street == other.street
        && postalCode == other.postalCode;
  }
}
