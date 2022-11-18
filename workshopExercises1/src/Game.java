public class Game
{
  private String name;
  private String gameGenre;
  private int numberOfPlayers;

  public Game(String name, int numberOfPlayers)
  {
    this.numberOfPlayers = numberOfPlayers;
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public String getGameGenre()
  {
    return gameGenre;
  }

  public int getNumberOfPlayers()
  {
    return numberOfPlayers;
  }

  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Game other =(Game) obj;
    return name== other.name && numberOfPlayers== other.numberOfPlayers && gameGenre== other.gameGenre;
    }
  }
