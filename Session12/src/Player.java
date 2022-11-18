import java.util.Random;

public class Player
{
  Random random = new Random();
  private String player1;
  private String player2;
  private int points1 = 50;
  private int points2 = 50;

  public Player(String player1, String player2)
  {
    this.player2 = player2;
    this.player1 = player1;
  }

  public void game()
  {
    int counter = 0;
    do
    {
      int n = random.nextInt(7);
      if (counter % 2 == 1)
      {
        points1 -= n;
        if (points1 < 1)
        {
          points1 += 2 * n;
        }
        else if (points1 == 1)
        {
          System.out.println(player1);
          System.out.println("you have won");
        }
        else
        {
          System.out.println(player1);
          System.out.println("You rolled:" + n);
          System.out.println("Your points are:" + points1);
        }
      }
      else
      {
        points2 -= n;
        if (points2 < 1)
        {
          points2 += 2 * n;
        }
        else if (points2 == 1)
        {
          System.out.println(player2);
          System.out.println("you have won");
        }
        else
        {
          System.out.println(player2);
          System.out.println("You rolled:" + n);
          System.out.println("Your points are:" + points2);
        }
      }
      counter++;
    }
    while (points2 != 1);

  }

  public int getPoints1()
  {
    return points1;
  }

  public int getPoints2()
  {
    return points2;
  }
}
