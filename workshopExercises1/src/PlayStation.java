public class PlayStation
{
  private String model;
  private Game game;

  public PlayStation(Game game, String model)
  {
    this.model = model;
   // this.game = new Game();
  }

  public String getModel()
  {
    return model;
  }

  public Game getGame()
  {
    return game;
  }

  public void setGame(Game game)
  {
    this.game = game;
  }

  public String toString()
  {
    return "Info about game:" + getGame() + getModel();
  }
}
