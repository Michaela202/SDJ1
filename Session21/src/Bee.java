public class Bee extends Animal
{
  private boolean isHoneyBee;

  public Bee(int age, boolean isHoneyBee)
  {
    super(age);
    this.isHoneyBee = isHoneyBee;
  }

  public void setHoneyBee(boolean honeyBee)
  {
    isHoneyBee = honeyBee;
  }

  public String toString()
  {
    return "BEE MAKES" + speak() + "\n INFO ABOUT BEES:" + "\n"
        + super.toString() + "\n HONEY?:" + isHoneyBee;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Bee other = (Bee) obj;
    return super.equals(other) && isHoneyBee == other.isHoneyBee;
  }

  public String speak()
  {
    return "Bzz";
  }
}
