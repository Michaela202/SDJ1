public class FootballPlayer
{
  private String name;
  private int skill;
  private int number;
  private String fieldPosition;
  private boolean isCaptain;

  public FootballPlayer(String name, int skill)
  {
    this.name = name;
    this.skill = skill;
    number = 0;
    fieldPosition = " ";
    isCaptain = false;
  }

  public String getName()
  {
    return name;
  }

  public int getNumber()
  {
    return number;
  }

  public void assignNumber(int number)
  {
    this.number = number;
  }

  public int getSkill()
  {
    return skill;
  }

  public void train()
  {
    skill++;
  }

  public String getFieldPosition()
  {
    return fieldPosition;
  }

  public void setFieldPosition(String fieldPosition)
  {
    this.fieldPosition = fieldPosition;
  }

  public boolean getIsCaptain()
  {
    return isCaptain;
  }

  public void setIsCaptain(boolean captain)
  {
    isCaptain = captain;
  }

  public String toString()
  {
    return "INFO:" +"\n" + name  +"\n" + skill+  "\n" +number  +"\n" +fieldPosition  +"\n" +isCaptain;
  }
}
