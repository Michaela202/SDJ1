import java.util.Scanner;
public class Challenge4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is your name?");
    String name = keyboard.nextLine();

    System.out.print("What is your address?");
    String address = keyboard.nextLine();
    System.out.print("How old are you?");
    int age = keyboard.nextInt();
    //for some reason you cant put order string int string ...dont do it
    System.out.println(name);
    System.out.println(age);
    System.out.println(address);

  }


}
