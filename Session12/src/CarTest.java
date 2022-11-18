public class CarTest
{
  public static void main(String[] args)
  {
    Car car = new Car( "Skoda", "Fabia", "blue", "ABSD78", 1999);
    Car car1 =new Car("Skoda", "Fabia", "blue" , 1999);
    System.out.println(car);
    System.out.println(car1);
    if(car.equals(car1))
    {
      System.out.println("This is the same car");
    }
    else
    {
      System.out.println("This is not the same car");
    }
  }
}
//should probably test more things