public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItem;
  private String passiveMemoryItemTwo;


  public Brain()
  {
    activeMemoryItem = "";
    passiveMemoryItem = "";
    passiveMemoryItemTwo = "";
  }

  public int getIQ()
  {

    if(isBrainDamaged())
      return 70;

    int a = activeMemoryItem.length();
    int p1 = passiveMemoryItem.length();
    int p2 = passiveMemoryItemTwo.length();

    if ((a > 20 && p1 > 10 && p2 > 10) || (p2 > 20 && p1 > 10 && a > 10) || (
        p1 > 20 && a > 10 && p2 > 10))
    {
      return 130;
    }
    else if (a > 10 && p1 > 10 && p2 > 10)
    {
      return 100;
    }
    else if (a < 10 || p2 < 10 || p1 < 10)
    {
      return 70;
    }
    else
      return 0;
  }

  public boolean isBrainDamaged()
  {
    if (passiveMemoryItem == null || passiveMemoryItemTwo == null
        || activeMemoryItem == null)
    {
      return true;
    }
    else
      return false;

  }

  public void remember(String info)
  {
    passiveMemoryItemTwo = passiveMemoryItem;
    passiveMemoryItem = activeMemoryItem;
    activeMemoryItem = info; // it cares about the order!!!
  }

  public void refreshMemory(String info)
  {
    if (passiveMemoryItem.equals(info))
    {
      passiveMemoryItem = activeMemoryItem;
      passiveMemoryItemTwo = passiveMemoryItem;
    }

    else
    {
      activeMemoryItem = passiveMemoryItem;
      passiveMemoryItem = passiveMemoryItemTwo;
    }

  }

  public boolean recall(String info)
  {
    if (activeMemoryItem.equals(info) || passiveMemoryItem.equals(info))
    {
      return true;
    }
    else
      return false;
  }

  public String recall()
  {
    return activeMemoryItem;
  }
}