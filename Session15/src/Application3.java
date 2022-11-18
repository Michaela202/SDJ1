public class Application3
{
  public static void main(String[] args)
  {
    int[] sourceArray = {2, 3, 4, 5};
    int[] destinationArray = new int[2 * sourceArray.length];
    for (int i = 0; i < destinationArray.length; i++)
    {
      if (i < sourceArray.length )
      {
        destinationArray[i] = sourceArray[i];
      }
      else
        destinationArray[i] = 0;
      }
      for (int i = 0; i < destinationArray.length; i++)
      {
        System.out.println( destinationArray[i]);
      }
    }
  }
