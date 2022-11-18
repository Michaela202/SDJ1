import java.util.Scanner;
public class Challenge6
{ public static void main(String[] agrs)
{
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Please insert your name");
  String name = keyboard.nextLine();
  System.out.println("Please insert a name of a city");
  String City = keyboard.nextLine();
  System.out.println("Please insert a name of an collage");
  String collage = keyboard.nextLine();
  System.out.println("Please insert a profession");
  String profession = keyboard.nextLine();
  System.out.println("Please insert a type of an animal");
  String animal = keyboard.nextLine();
  System.out.println("Please insert a pets name");
  String pet = keyboard.nextLine();
  System.out.println("Please insert your age");
  int myage = keyboard.nextInt();
  System.out.println("There once was a person named " + name+ " who lived in "+ City+". At the age of " + myage + " "
      + name + " went to college at " + collage + ".  " + name + " graduated and went to work as a "+ profession + "."+
      "Then," + name + " adopted an " + animal + " named " + pet + ". They both lived happily ever after");
}
}
