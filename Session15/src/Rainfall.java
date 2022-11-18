import java.util.Scanner;

public class Rainfall
{

  private double rain[];

  public Rainfall(double[] rain)
  {
    this.rain = rain;
  }

  public double getTotal()
  {
    double total = 0;

    for (int i = 0; i < rain.length; i++)
    {
      total += rain[i];
    }
    return total;

  }

  public double getAverage()
  {
    int total = 0;
    for (int i = 0; i < rain.length; i++)
    {
      total += rain[i];
    }
    return total / rain.length;

  }

  public double getMax()
  {
    double highest = rain[0];
    for (int i = 1; i < rain.length; i++)
    {
      if (rain[i] > highest)
      {
        highest = rain[i];
      }
    }
    return highest;
  }

  public double getMin()
  {
    double lowest = rain[0];
    for (int i = 1; i < rain.length; i++)
    {
      if (rain[i] < lowest)
      {
        lowest = rain[i];
      }
    }
    return lowest;
  }
}
