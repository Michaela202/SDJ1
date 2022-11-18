package Servise;

import java.util.ArrayList;

public class ServiceBook
{
  public ArrayList<Service> services;

  public ServiceBook()
  {
    services = new ArrayList<>();
  }

  public void addService(Service service)
  {
    services.add(service);
  }

  public int getNumberOfServices()
  {
    return services.size();
  }

  public Service getService(int index)
  {
    return services.get(index);
  }

  public ArrayList<Service> getAllServices()
  {
    return services;
  }

  public int[] getAllServiceMileages()
  {
    int[] ASM = new int[services.size()];
    for (int i = 0; i < services.size(); i++)
    {
      ASM[i] = services.get(i)
          .getMileage(); //what exactly I am doing in this line?
    }
    return ASM;
  }

  public boolean hasServiceDate(Date date)
  {

    for (int i = 0; i < services.size(); i++)
    {
      if (services.get(i).getDate().equals(
          date)) //I am checking if every object has a date and if the date is the same as the new date
      {
        return true;
      }
    }
    return false;

  }

  public Date getDateOfLastService()
  {
    return services.get(services.size() - 1)
        .getDate(); //.getDate is important because it changes it to the Servise.Date format

  }

  public boolean equals(Object obj)
  {
    if (obj == null || Object.class != obj.getClass())
    {
      return false;
    }
    ServiceBook other = (ServiceBook) obj;
    return services.equals(other);
  }

  public String toString()
  {
    String temp = "";
    for (int i = 0; i < services.size(); i++)
    {

      temp += services.get(i) + "\n"; // makes it pretty...space

    }
    return temp;
  }

}
