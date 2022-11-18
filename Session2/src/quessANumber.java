import java.util.Random;
import java.util.Scanner;

public class quessANumber
{
  public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(1000);
    int num;
    int counter =0;
    do
    {
      System.out.println("Please try to guess a number between 1 and 1000 ");
      num = scanner.nextInt();
      if(number>num)
        System.out.println("Please try to guess higher");
      if(number<num)
        System.out.println("Please try to guess lower");
        counter++;
    }
    while(!(number==num));
    System.out.println("Your guess was correct");
    System.out.println("You guess it in " + counter + " tries! Congrats!!!");
  }
}
