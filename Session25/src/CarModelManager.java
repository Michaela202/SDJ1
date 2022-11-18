import java.io.FileNotFoundException;
import java.io.IOException;

public class CarModelManager
{
  private String fileName;

  public CarModelManager(String fileName)
  {
    this.fileName = fileName;
  }

  public CarList getAllCars()
  {
    CarList allCars = new CarList();
    try
    {
      allCars = (CarList) MyFileHandler.readFromBinaryFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO ERROR reading file");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class not found");
    }
    return allCars;
  }

  public void addCar(Car car)
  {
    CarList allCars = getAllCars();
    allCars.addCar(car);
    try
    {
      MyFileHandler.writeToBinaryFile(fileName, allCars);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO ERROR reading file");
    }

  }

  public void addCars(CarList carList)
  {
    CarList allCars = getAllCars();
    for (int i = 0; i < allCars.size(); i++)
    {
      allCars.addCar(carList.getCar(i));
      try
      {
        MyFileHandler.writeToBinaryFile(fileName, allCars);
      }
      catch (FileNotFoundException e)
      {
        System.out.println("File not found");
      }
      catch (IOException e)
      {
        System.out.println("IO ERROR reading file");
      }
    }
  }

  public void deleteCar(Car car)
  {
    CarList allOtherCars = new CarList();
    CarList allCars = getAllCars();
    for (int i = 0; i < allCars.size(); i++)
    {

      if(allCars.getCar(i)!= car){
        allOtherCars.addCar(allCars.getCar(i));
      }
      try
      {
        MyFileHandler.writeToBinaryFile(fileName, allOtherCars);
      }
      catch (FileNotFoundException e)
      {
        System.out.println("File not found");
      }
      catch (IOException e)
      {
        System.out.println("IO ERROR reading file");
      }
    }
  }

  public void deleteCarByRegNum(String regNumber)
  {
    CarList allOtherCars = new CarList();
    CarList allCars = getAllCars();
    for (int i = 0; i < allCars.size(); i++)
    {

      if(!allCars.getCar(i).getRegNumber().equals(regNumber)){
        allOtherCars.addCar(allCars.getCar(i));
      }
      try
      {
        MyFileHandler.writeToBinaryFile(fileName, allOtherCars);
      }
      catch (FileNotFoundException e)
      {
        System.out.println("File not found");
      }
      catch (IOException e)
      {
        System.out.println("IO ERROR reading file");
      }
    }
  }
}
