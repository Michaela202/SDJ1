import java.util.Scanner;

public class Password
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an username");
    String username = scanner.nextLine();
    String password;
    String confirmation;
    do
    {
    System.out.println("Please enter a password");
    password = scanner.nextLine();
    System.out.println("Please enter a confirmation password");
    confirmation = scanner.nextLine();

      if(password.equals(confirmation))
        System.out.println("Entered passwords are identical. Good job!");
      else
        System.out.println("The passwords do not match. Please try again.");

    }
    while(!(password.equals(confirmation)));
    System.out.println("Entered username: " + username);
    System.out.println("Your password is " + password);

  }

}
