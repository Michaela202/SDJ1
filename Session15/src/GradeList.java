public class GradeList
{
  private int[] grades;

  public GradeList(int numberOfGrades)
  {
    grades = new int[numberOfGrades]; //explanation
    for (int i = 0; i < grades.length; i++)
    {
      grades[i] = -1;
    }
  }

  public int getNumberOfGrades()
  {
    int counter = 0;
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] != -1)
      {
        counter++;
      }
    }
    return counter;
  }

  public int getGrade(int index)
  {
    return grades[index];
  }

  public void setGrade(int index, int grade)
  {

    grades[index] = grade; //explain to myself
  }

  public double getAverage()
  {
    int total = 0;

    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] != -1)
      {
        total += grades[i];

      }

    }
    return (double) total / getNumberOfGrades();
  }

  public String toString()
  {
    String returnStr = "";
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] != 1)
      {
        returnStr += grades[i];
      }
      else
        return null;
    }
    return returnStr;
  }
}
  //String is not working properly

  //boolean method missing
