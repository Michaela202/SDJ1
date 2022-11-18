import java.io.FileNotFoundException;
import java.io.IOException;
public class LoadingData
{
  public static void main(String[] args)
  {
    CarList carList = new CarList();
    Object[] carArray = null;
    try
    {
      carArray = MyFileHandler.readArrayFromTextFile("Session25/src/cars.txt");
      for (int i = 0; i < carArray.length; i++)
      {
        String temp = (String) carArray[i];
        String[] tempArr = temp.split(",");
        String  RegNo= tempArr[0];
        String make = tempArr[1];
        String model = tempArr[2];
        String year = tempArr[3];
        String firstName = tempArr[4];
        String lastName = tempArr[5];


        carList.addCar(
            new Car(RegNo,make,model,Integer.parseInt(year), new Owner(firstName,lastName)));
      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File was not found, or could not be opened");
    }

    try
    {
      MyFileHandler.writeToBinaryFile("Session25/src/cars.bin", carList);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("Error opening file ");
    }
    catch (IOException e)
    {
      System.out.println("IO Error writing to file ");
    }

    System.out.println("Done");
  }
}
