package game;
public class Indoor
{
   String player;
  public Indoor()
  {
   player="om";
  }
  public Indoor(String player)
  {
   this.player=player;
  }
  public void disp()
  {
    System.out.println("player name="+player);
  }
}