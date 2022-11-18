public class StudentTest
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Michaela", 0);
    try
    {
     student1.setGrade(-15);
    }
    catch (IllegalGradeException e)
    {
      System.out.println( e.getMessage());
    }
    System.out.println(student1.getGrade());
  }
}
