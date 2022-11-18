import java.util.Scanner;
public class Gender
{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please insert a gender");
    char name = keyboard.next().charAt(0); //citanie char v keybord lahka verzia asi
    System.out.println("Please insert an age");
    int age = keyboard.nextInt();
    if(age<0 && name!='m' && name!='f')
      System.out.println("Error in typed value");
    else if (name == 'm' && age<18)
      System.out.println("Boy");
    else if(name == 'm' && age>=18)
      System.out.println("Man");
    else if(name == 'f' && age<18)
      System.out.println("Girl");
    else if (name == 'f' && age>=18)
      System.out.println("Woman");
    {


    }

  }
}
