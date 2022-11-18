import java.util.Scanner;

public class LandTrackTest
{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);


    System.out.println("Please insert an integer one");
    int a = scanner.nextInt();
    System.out.println("Please insert an integer two");
    int b = scanner.nextInt();
    System.out.println(LandTrack.area(a,b));;
    System.out.println("Please insert an integer one");
    int c = scanner.nextInt();
    System.out.println("Please insert an integer two");
    int d = scanner.nextInt();
    System.out.println(LandTrack.area(c,d));

    LandTrack landtrack1=new LandTrack(a,b);
    LandTrack landtrack2=new LandTrack(c,d);
    System.out.println("Is it true that the area of these two landfields is the same?"+ "\n" +landtrack1.equals(landtrack2));


  }
}
