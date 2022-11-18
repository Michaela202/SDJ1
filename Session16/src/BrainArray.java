public class BrainArray
{
  private String[] memoryItems = new String[3];

  public BrainArray()
  {
    memoryItems[0]="";
    memoryItems[1]="";
    memoryItems[2]="";
  }

  public int getIQ()

  {
    if (isBrainDamaged())
      return 70;
    int a = memoryItems[0].length();
    int p1 = memoryItems[1].length();
    int p2 = memoryItems[2].length();
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
    if (memoryItems[1] == null || memoryItems[2] == null
        || memoryItems[0] == null)
    {
      return true;
    }
    else
      return false;

  }

  public void remember(String info)
  {
    memoryItems[2] = memoryItems[1];
    memoryItems[1] = memoryItems[0];
    memoryItems[0]= info; // it cares about the order!!!
  }
  public void refreshMemory(String info)
  {
    if (memoryItems[1].equals(info))
    {

      memoryItems[1] = memoryItems[0];
      memoryItems[0]=info;


    }

    else
    {
      memoryItems[2] = memoryItems[1];
      memoryItems[1] = memoryItems[0];
      memoryItems[0]= info; // it cares about the order!!!
    }


  }
  public boolean recall(String info)
  {
    if (memoryItems[0].equals(info) || memoryItems[1].equals(info))
    {
      return true;
    }
    else
      return false;
  }
  public String recall()
  {
    return memoryItems[0];
  }
}
