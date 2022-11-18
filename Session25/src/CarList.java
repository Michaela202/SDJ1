import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  private ArrayList<Car> cars;

  public CarList()
  {

    cars= new ArrayList<>();
  }

  public int size()
  {
    return cars.size();
  }

  public int indexRegNumber(String argument)
  {
    for (int i = 0; i < cars.size(); i++)
    {

      if (cars.get(i).getRegNumber().equals(argument))
      {
        return i;
      }
    }
    return -1;
  }

  public Car getCar(int index)
  {
    for (int i = 0; i < cars.size(); i++)
    {
      if (i == index)
      {
        return getCar(i);
      }
    }
    return null;
  }

  public Car getCar(String reg)
  {
    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.get(i).getRegNumber().equals(reg))
      {
        return cars.get(i);
      }
    }
    return null;
  }

  public void addCar(Car car)
  {
    if (!cars.contains(car))
    {
      cars.add(car);
    }
  }

  public String toString()
  {
    String temp = " ";
    for (int i = 0; i < cars.size(); i++)
    {
     temp += cars.get(i) + "\n";
    }
    return temp;
  }
}