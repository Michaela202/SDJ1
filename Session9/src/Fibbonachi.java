public class Fibbonachi
{
  public static void main(String[] agrs)
  {
    int number1 = 0;
    int number0 = 1;
    int sum = number1+number0;
    for(int i =0; i <20; i ++)
    {
      sum = number1 + number0;
      number0=number1;
      number1=sum; //changing the value ...it is recognized as the shifted value
      System.out.println("Fibonacci("+i+ ") =" +sum);//builed in counter
    }
  }
}
