import java.util.Scanner;

public class Calculator
{
  public static void main(String[] args)
  {
    String word;
    String multiplication= "multiplication";
    String addition = "addition";
    String substraction = "substraction";
    String divition = "divition";

    Scanner scanner =new Scanner(System.in);
    System.out.println("Please insert a number");
    double a = scanner.nextDouble();
    System.out.println("Please insert another number");
    double b =scanner.nextDouble();
    System.out.println("Please write a name of the operator you want to use");
    word = scanner.nextLine();

    //doin it with if
    if(word.equals(multiplication))
    {

    }
  }
}
/* do
     {
     System.out.println("Please insert a word");
     word = keyboard.nextLine(); //here only giving the value to the word
     for (int i = word.length() - 1; i >= 0; i--)
     {
     System.out.print(word.charAt(i));
     }
     System.out.println();
     }
     while(!(word.equals("quit")));*/