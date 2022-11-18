import java.util.Scanner;
public class Challenge2
{ public static void main(String[] agrs)
{
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Please insert an integer one");
  int myIntone = keyboard.nextInt();
  System.out.println("Please insert an integer two");
  int myInttwo = keyboard.nextInt();
  System.out.println("Please insert an integer three");
  int myInttree = keyboard.nextInt();
  int sum = myInttwo + myInttree + myIntone;
  int product = myInttwo* myIntone * myInttree;
  System.out.println(sum);
  System.out.println(product);

}
}
