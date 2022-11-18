public class Ex1507
{
  public static void main(String[] args)
  {
    int[] array = {3, 5, 1, 3, 3, 2, 4, 2, 3};
    int counter = 0;
    int sum = 0;
    for (int i = 0; i < array.length; i++)
    {
      if (array[i] == 1)
      {
        counter++;
      }
      sum += array[i];
    }
    int total = 0;
    System.out.println(sum);

    double average;
    for (int i = 0; i < array.length; i++)
    {
      total += array[i];
    }
    average = total / array.length;
    System.out.println(average);
    System.out.println(counter);
  }

}
