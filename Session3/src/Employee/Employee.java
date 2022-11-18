package Employee;

public class Employee
{
  private String name;
  private int idNumber;
  private String department;
  private String position;

  public void setName(String name1)
  {
 name = name1;
  }

  public void setDepartment(String department)
  {
    this.department = department;
  }

  public void setIdNumber(int idNumber)
  {
    this.idNumber = idNumber;
  }

  public void setPosition(String position)
  {
    this.position = position;
  }

  public String getName()
  {
    return name;
  }

  public int getIdNumber()
  {
    return idNumber;
  }

  public String getDepartment()
  {
    return department;
  }

  public String getPosition()
  {
    return position;
  }

}
