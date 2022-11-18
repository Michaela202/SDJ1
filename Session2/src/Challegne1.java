import java.util.Scanner;
public class Challegne1
{
  public static void main(String[] args)
  {
    System.out.println("Please insert the name of your favorite city");
    Scanner keyboard = new Scanner(System.in);
    String favoriteCity = keyboard.nextLine();

    int strSize = favoriteCity.length();
    String upper = favoriteCity.toUpperCase();
    String lower = favoriteCity.toLowerCase();
    char letter = favoriteCity.charAt(1);
    System.out.println(strSize);
    System.out.println(upper);
    System.out.println(lower);
    System.out.println(letter);
  }
}
