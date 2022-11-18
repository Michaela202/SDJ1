public class MyNumber
{
  private int number;

  public MyNumber(int number)
  {
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }

  public int getLastDigit()
  {
    if (number > 0)
    {
      return number % 10;
    }
    else
      return (number % 10) * 2;
  }

  public int getFirstDigit()
  {
    while (number % 10 >= 0 && number % 10 <= 9)
    {
      return number % 10;
    }
    return 0;
  }

  public boolean isDivisibleBy(int anotherInt)
  {

    if (anotherInt % number == 0)
    {

      return true;
    }
    else

      return false;

  }

  public int numberOfProperDivisors()
  {
    int c = 0;
    while (isDivisibleBy(58))
    {
      return c++;
    }
    return 0;
  }

  public boolean isPrime()
  {
    if (numberOfProperDivisors() == 1)
    {
      return true;
    }
    else
      return false;
  }

  public String toString()
  {
    if (isPrime())
    {
      return "" + number + "(a prime number)";
    }
    else
      return "+number";
  }

  public MyNumber plus(MyNumber anotherNumber)
  {
    if (anotherNumber.getNumber() == 0 || getNumber() == 0)
    {
      if (anotherNumber.getNumber() == 0)
      {
        return new MyNumber(getNumber());
      }
      else if (getNumber() == 0)
      {
        return anotherNumber;
      }
    }
    MyNumber result = new MyNumber(anotherNumber.getNumber() + getNumber());
    return result;
  }

  //the hard way
  public int sumOfDivisors()
  {
    int sum = 0;
    for (int i = 1; i <number; i++)
    {

      if (number % i == 0)
      {
        sum += i;
      }
    }
    return sum;
  }

  public boolean isPerfectnumber()
  {
    if (sumOfDivisors() == number)
    {
      return true;
    }
    else
      return false;

  }
}