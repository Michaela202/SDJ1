package Person;

public class Teacher extends Person
{
	private double payRate;
	private double hours;

	public Teacher(String name, String addr, double rate, double hours)
	{
		super(name, addr);
		payRate = rate;
		this.hours = hours;
	}

	public double getPayRate()
	{
		return payRate;
	}

	public void setPayRate(double payRate)
	{
		this.payRate = payRate;
	}

	public double getHours()
	{
		return hours;
	}

	public void setHours(double hours)
	{
		this.hours = hours;
	}
 
	public double getSalary()
	{
		return payRate * hours;
	}

	public String toString()
	{
		return super.toString() + ", PayRate: " + payRate + ", Hours :" + hours;
	}
 
	public boolean equals(Object obj)
	{
		if (obj == null || getClass() != obj.getClass())
		{
			return false;
		}

		Teacher other = (Teacher) obj;

		return super.equals(other) && payRate == other.payRate
				&& hours == other.hours;
	}
}
