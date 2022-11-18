import java.util.ArrayList;

public class FootballClub
{
  private String name;
  private ArrayList<FootballPlayer> team;

  public FootballClub(String name)
  {
    this.name = name;
    team = new ArrayList<>();
  }

  public void signPlayer(FootballPlayer player, String fieldPosition,
      int number)
  {
    team.add(player);
    player.setFieldPosition(fieldPosition);
    player.assignNumber(number);
  }

  public void trainGoalkeepers()
  {
    for (int i = 0; i < team.size(); i++)
    {
      FootballPlayer thisPlayer = team.get(i);
      if (thisPlayer.getFieldPosition().equals("Goalkeeper"))
      {
        thisPlayer.train();
      }
    }
  }

  public void trainOutfieldPlayers()
  {
    for (int i = 0; i < team.size(); i++)
    {
      FootballPlayer thisPlayer = team.get(i);
      if (thisPlayer.getFieldPosition().equals("Midfielder")
          || thisPlayer.getFieldPosition().equals("Midfielder")
          || thisPlayer.getFieldPosition().equals("Forward"))
      {
        thisPlayer.train();
      }
    }
  }

  public FootballPlayer getCaptain()
  {
    for (int i = 0; i < team.size(); i++)
    {
      if(team.get(i).getIsCaptain()){
        return team.get(i);
      }
    }
    return null;
  }
}
