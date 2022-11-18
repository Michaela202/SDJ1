import java.util.Scanner;
public class UnoReverse
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String word; //initialising
    do
    {
      System.out.println("Please insert a word");
      word = keyboard.nextLine(); //here only giving the value to the word
      for (int i = word.length() - 1; i >= 0; i--)
      {
        System.out.print(word.charAt(i));
      }
      System.out.println();
    }
    while(!(word.equals("quit")));
  }
}
