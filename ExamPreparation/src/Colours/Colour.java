package Colours;

public class Colour
{
  private int red;
  private int green;
  private int blue;

  public Colour(int red, int green, int blue)
  {
    this.blue = blue;
    this.red = red;
    this.green = green;

  }

  public void set(int red, int green, int blue)
  {
    this.blue = blue;
    this.red = red;
    this.green = green;
  }

  public int getRed()
  {
    return red;
  }

  public int getBlue()
  {
    return blue;
  }

  public int getGreen()
  {
    return blue;
  }

  public boolean isGray()
  {
    if (red == green && green == blue) //do I have to write all options?
    {
      return true;
    }
    return false;
  }
//how do I mix colours?
  public void mixWith(Colour colour2)
  {
    //I need to cast the second one
     red= (int)(0.5*red+ 0.5*colour2.red);
     green= (int)(0.5*green+ 0.5*colour2.green);
     blue= (int)(0.5*blue+ 0.5*colour2.blue);
  }

  public Colour copy()
  {
    Colour copy = new Colour(red, green, blue);
    return copy;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Colour other = (Colour) obj;
    return red == other.red && blue == other.blue && green == other.green;
  }

  public String toString()
  {
    return "Color-blue-green-red:" + blue + "\n" + green + "\n" + red;
  }
}
