import java.util.Scanner;
public class Password
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter an username");
    String username = keyboard.nextLine();
    System.out.println("Please enter a password");
    String password = keyboard.nextLine();
    System.out.println("Please enter a confirmation password");
    String confirmation = keyboard.nextLine();
    System.out.println(username);
    if(password.equals(confirmation))
    System.out.println("Entered passwords are identical. Good job!");
    else
      System.out.println("The passwords do not match");
  }
}
