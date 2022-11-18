import java.util.ArrayList;

public class GradeListArray
{
  private ArrayList<Grade> grades;

  public GradeListArray()
  {
    grades = new ArrayList<Grade>();

  }

  public int getNumberOfGrades()
  {
    return grades.size();
  }

  public ArrayList<Grade> getAllgrades()
  {
    return grades;
  }

  public Grade[] getAllGradesAsArray()
  {
   return grades.toArray(new Grade[grades.size()]); //Alan said this is the shorter way
  }

  public void addGrade(Grade grade)
  {
    grades.add(grade);
  }

  public double getAverage()
  {
    int total = 0;

    for (int i = 0; i < grades.size(); i++)
    {

      total += grades.get(i).getGrade();// using GET becouse we are trying to access it

    }
    return (double) total / getNumberOfGrades();
  }

  public String toString()
  {
    return "Grade:" + grades + "\n" + "Average: " + getAverage() + "number of grades" + getNumberOfGrades() + "All grades" + getAllgrades();
  }
}
