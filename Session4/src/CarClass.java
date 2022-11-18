public class CarClass
{
  private int yearModel;
  private int speed;
  private String make;

  public CarClass(int yearModel, String make){
    this.make = make;
    speed = 0;
    this.yearModel = yearModel;
  }

  public int getSpeed()
  {
    return speed;
  }

  public int getYearModel()
  {
    return yearModel;
  }

  public String getMake()
  {
    return make;
  }
  public void Accelerate(){
    speed+=5;
  }
  public void Brake(){
    speed-=5;
  }
}
