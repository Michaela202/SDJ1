public class Car
{
  private String make;
  private String model;
  private String color;
  private String licenseNumber;
  private int year;

  public Car(String make, String model, String color, String licenseNumber, int year)
  {
   this.make= make;
   this.color= color;
   this.model =model;
   this.year = year;
   this.licenseNumber = licenseNumber;
  }

  public Car(String make, String model, String color, int year)
  {
   // licenseNumber = null;
    this.year = year;
    this.make = make;
    this.color = color;
    this.model = model;
  }
  public int getYear()
  {
    return year;
  }

  public String getMake()
  {
    return make;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public String getModel()
  {
    return model;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }
  public Car copy()
  {
    return new Car(make, model, color, licenseNumber, year ); //order
  }
public String toString()
{
    return "Information:" + make + "/" + model+ "/" + color + "/" + licenseNumber + year + "/";
}
  public boolean equeals(Object obj)
  {
    if ( obj ==null || getClass()!= obj.getClass())
    {
      return false;
    }
    Car other = (Car) obj;
    return make == other.make &&
        color == other.make &&
        model == other.model &&
        licenseNumber == other.licenseNumber &&
        year == other.year;

  }
}
