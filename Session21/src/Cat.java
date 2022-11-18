public class Cat extends Pet
{
  private boolean isHouseCat;

  public Cat(int age, String name, boolean isHouseCat)
  {
    super(age, name);
    this.isHouseCat = isHouseCat;
  }

  public void setHouseCat(boolean houseCat)
  {
    isHouseCat = houseCat;
  }

  public boolean getIsHouseCat()
  {
    return isHouseCat;
  }

  public String toString()
  {
    return super.toString() + "CAT MAKES" + speak() + "HouseCAt?:" + isHouseCat;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Cat other = (Cat) obj;
    return super.equals(other) && isHouseCat == other.isHouseCat;
  }

  public String speak()
  {
    return "Meow";
  }

}
