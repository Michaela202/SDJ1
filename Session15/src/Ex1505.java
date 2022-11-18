import java.util.Scanner;

public class Ex1505
{
  public static void main(String[] args)
  {

    Scanner scanner = new Scanner(System.in);
    int[] array1 = new int[4];
    for (int i = 0; i < array1.length; i++)
    {
      System.out.println("Please insert an integer");
      array1[i] = scanner.nextInt();
    }
    int[] array2 = new int[4];
    for (int i = 0; i < array2.length; i++)
    {
      System.out.println("Please insert an integer one");
      array2[i] = scanner.nextInt();
    }
    boolean arraysEqual = true;
    if (array1.length != array2.length)
      arraysEqual = false;
    else
    {
      for (int i = 0; i < array1.length; i++)
      {
        if (array1[i] != array2[i])
        {
          arraysEqual = false;
          System.out.println("array1= " + array1[i] + "and array2= " + array2[i]
              + "are NOT identical");
          break;
        }
      }
    }

       if(arraysEqual)
          System.out.println("are identical");
      }


    /*if (arraysEqual)
      System.out.println("array1=" + array1[i] + "and array2" + array2[i]
          + "are NOT identical");
    else
      System.out.println("array1=" + array1[i] + "and array2" + array2[i]
          + "are identical");*/
}
