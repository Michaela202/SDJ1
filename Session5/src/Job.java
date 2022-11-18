public class Job
{
  private String jobTitle;
  private double monthltSalary;
  private Person employee;

  public Job()
  {
    this.monthltSalary = monthltSalary;
    this.jobTitle = jobTitle;
    this.employee = employee;

  }

  public Job(String jobTitle, double monthltSalary)
  {
    this.jobTitle = jobTitle;
    this.monthltSalary = monthltSalary;
    employee = null;
  }

  public void setEmployee(Person employee)
  {
    this.employee = employee;
  }

  public void setJobTitle(String jobTitle)
  {
    this.jobTitle = jobTitle;
  }

  public void setMonthltSalary(double monthltSalary)
  {
    this.monthltSalary = monthltSalary;
  }

  public double getMonthltSalary()
  {
    return monthltSalary;
  }

  public String getJobTitle()
  {
    return jobTitle;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public void givePercentageRaise(double percentage)
  {
    monthltSalary += monthltSalary*percentage;
  }
}

