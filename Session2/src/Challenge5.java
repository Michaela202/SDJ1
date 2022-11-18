import java.util.Scanner;
public class Challenge5
{  public static void main(String[] args)
{
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Please insert a  value of the first score");
  int firstscore = keyboard.nextInt();
  System.out.println("Please insert a  value of the second score");
  int secondscore = keyboard.nextInt();
  System.out.println("Please insert a  value of the thrd score");
  int thrdscore = keyboard.nextInt();
  double avarage = ((firstscore + secondscore + thrdscore)/3);
  System.out.println(firstscore);
  System.out.println(secondscore);
  System.out.println(thrdscore);
  System.out.println(avarage);
}
}
