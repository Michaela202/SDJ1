package Colours;

import java.util.ArrayList;

public class ColourPalette
{
  //composition means using copies
  private int numberOfColours;
  private ArrayList<Colour> colours;

  public ColourPalette(int maxNumberOfColours)
  {
    colours = new ArrayList<>();
    this.numberOfColours = maxNumberOfColours;
  }

  public void add(Colour colour)
  {
    if (colours.size() < numberOfColours)
    {
      colours.add(colour.copy());
    }
  }

  public Colour get(int index)
  {

    return colours.get(index).copy();
  }

  public int getNumberOfGrayColours()
  {
    int counter = 0;
    for (int i = 0; i < colours.size(); i++)
    {
      if (colours.get(i).isGray()) //arraylist ..needs index!!!!!
        counter++;
    }
    return counter;
  }

  public void mixColours(int index, Colour colour)
  {
    colours.get(index).mixWith(colour);
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Colour other = (Colour) obj;
    return colours.equals(other);
  }

  public String toString()
  {
    return "THIS COLOUR IS:" + colours; //what is this going to print ?
  }
}
