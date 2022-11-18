public class GradeTest
{
  public static void main(String[] args)
  {
    GradeList gradeList = new GradeList(20);
    //for (int i = 0; i < 20; i++)
    {
      Grade grade = new Grade("math", -3);
      gradeList.setGrade(0, 10);
      System.out.println(grade.toString());
    }
  }
}