public class Game
{
  public static void main(String[] args)
  {
    Player player = new Player("Michaela", "Bence");
    do
    {
      player.game();
    }
    while (player.getPoints1() != 1 && player.getPoints2() != 1);
  }
}