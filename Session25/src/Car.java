import java.io.Serializable;

public class Car implements Serializable
{
  private String regNumber;
  private String make;
  private String model;
  private int year;
  private Owner owner;

  public Car(String regNumber, String make, String model, int year, Owner owner)
  {
    this.make = make;
    this.model = model;
    this.year = year;
    this.owner = owner;
    this.regNumber = regNumber;
  }

  public String getModel()
  {
    return model;
  }

  public String getMake()
  {
    return make;
  }

  public int getYear()
  {
    return year;
  }

  public Owner getOwner()
  {
    return owner;
  }

  public String getRegNumber()
  {
    return regNumber;
  }

  public String toString()
  {
    return "CAR PROPERTIES:" + regNumber + "," + make + "," + model + "," + year
        + "," + owner;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Car other = (Car) obj;
    return regNumber.equals(other.regNumber) && make.equals(other.make)
        && model.equals(other.model) && year == other.year
        && owner == other.owner;
  }
}
