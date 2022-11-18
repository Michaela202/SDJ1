import java.util.Random;

public class RandomEx2
{
  public static void main(String[] args)
  {

    Random random=new Random();
    int even = 0;
    int odd = 0;
    for (int i = 1; i <= 6; i++)
    {
      int n=random.nextInt(100); //!!!! je to magic
      System.out.println(n);
      if(n%2==0){
         even+=n;
      }
      else
        odd+=n;
    }
    System.out.println(even);
    System.out.println(odd);
  }

}