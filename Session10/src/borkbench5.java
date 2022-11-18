public class borkbench5
{
  public static void main(String[] args)
  {
    double total=0;
    for (int i = 1; i <= 30; i++)
    {
      for (int j = 30; j >= 1; j--)
      {
       total += ((double)i/j);

      }
    }
    System.out.println(total);
  }

}
