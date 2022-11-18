package Payroll;

public class ThePayroll
{
  private String Name;
  private double hourlyPayRate;
  private int NOH;

  public void setName(String name)
  {
    Name = name;
  }

  public void setHourlyPayRate(double hourlyPayRate)
  {
    this.hourlyPayRate = hourlyPayRate;
  }

  public void setNOH(int NOH)
  {
    this.NOH = NOH;
  }

  public String getName()
  {
    return Name;
  }

  public int getNOH()
  {
    return NOH;
  }

  public double getHourlyPayRate()
  {
    return hourlyPayRate;
  }
  public double returnOfGrossPay(){
    return hourlyPayRate * NOH;

  }
}
