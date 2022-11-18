public class workbench8
{
  public static void main(String[] args)
  {
    int space=0;
    for(int i =0; i<6;i++)
    {
      System.out.print("#");
      for(int j=0; j<space; j++)
      {
        System.out.print(" ");
      }
      System.out.print("#");
      System.out.println();
      space++;
    }

  }
}
