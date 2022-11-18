public class Test
{
  public static void main(String[] args)
  {
    CarModelManager carModelManager= new CarModelManager("Session25/src/cars.bin");
    CarList carList = carModelManager.getAllCars();
    System.out.println(carList);

  }
}
