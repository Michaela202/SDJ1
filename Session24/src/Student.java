public class Student
{
  private String firstName;
  private String lastname;
  private String country;

  public Student(String firstName, String lastname, String country)
  {
    this.firstName = firstName;
    this.lastname = lastname;
    this.country = country;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastname()
  {
    return lastname;
  }

  public void setLastname(String lastname)
  {
    this.lastname = lastname;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public String toString()
  {
    return "INFO ABOUT STUDENT:" + firstName + "\n" + lastname + "\n" + country;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
   Student other = (Student) obj;
    return firstName.equals(other.firstName) && lastname.equals(other.lastname) && country.equals(other.country);
  }
}
