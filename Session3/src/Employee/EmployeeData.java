package Employee;

public class EmployeeData
{
  public static void main(String[] args)
  {
    Employee one = new Employee();
    Employee two = new Employee();
    Employee three = new Employee();
    one.setName("Susan Meyers");
    one.setDepartment("Accounting");
    one.setIdNumber(47899);
    one.setPosition("Vice president");
    two.setName("Mark Jones");
    two.setDepartment("IT");
    two.setIdNumber(39119);
    two.setPosition("Programmer");
    three.setName("Joy Rogers");
    three.setIdNumber(81774);
    three.setPosition("Engineer");
    three.setDepartment("Manufacturing");
    System.out.println(one.getDepartment());
    System.out.println(two.getDepartment());
    System.out.println(three.getDepartment());
    System.out.println(one.getName());
    System.out.println(two.getName());
    System.out.println(three.getName());
    System.out.println(one.getPosition());
    System.out.println(two.getPosition());
    System.out.println(three.getPosition());
    System.out.println(three.getIdNumber());
    System.out.println(two.getIdNumber());
    System.out.println(one.getIdNumber());
  }
}
