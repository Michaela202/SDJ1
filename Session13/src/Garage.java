public class Garage
{
  private Car position1;
  private Car position2;

  public Garage()
  {
    position1 = null;
    position2 = null;
  }

  public boolean isParkingAreaTaken(int position)
  {
    if (position <= 2 && position > 0)
    {
      if (position == 1 && position1 == null)
      {
        return false;
      }
      else if (position == 1 && position1 != null)
        return true;
      else if (position == 2 && position2 == null)
      {
        return false;
      }
      else if (position == 2 && position2 != null)
      {
        return true;
      }
      else
        return false;
    }
    else
      return false;
  }

  public void park(Car car, int position)
  {
    if (!isParkingAreaTaken(position))
    {
      if (position == 1)
      {
        position1 = car;
      }
      else if (position == 2)
      {
        position2 = car;
      }
    }
  }

  public Car leaveGarage(int position)
  {
    Car temp;
    if (position == 1)
    {
      temp = position1;
      position1 = null;
      return temp;

    }
    else if (position == 2)
    {
      temp = position2;
      position2 = null;
      return temp;
    }
    else
      return null;
  }

  public String toString()
  {
    return position1 + "\n" + position2;
  }

  //equals method
  public boolean equals(Garage obj)
  {
    if (position1 == null && obj.position1 != null)
    {
      return false;
    }
    else if (position1 != null && obj.position1 == null)
    {
      return false;
    }
    else if (position2 == null && obj.position2 != null)
    {
      return false;
    }
    else if (position2 != null & obj.position2 == null)
    {
      return false;
    }
    else if (position2 == null && obj.position2 == null)
    {
      return false;
    }
return true;
  }
}