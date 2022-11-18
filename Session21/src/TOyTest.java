public class TOyTest
{
  public static void main(String[] args)
  {
    Toy[] toys = new Toy[3];
    toys[0] = new Football(5, 15);
    toys[1] = new Lego(5, 500);
    toys[2] = new Handball(5, 50);
    for (int i = 0; i < toys.length; i++)
    {
      System.out.println(toys[i].play());
    }
  }
}
