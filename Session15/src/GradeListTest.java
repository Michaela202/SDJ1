import java.util.Scanner;

public class GradeListTest
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    GradeList gradeList = new GradeList(10);
    for (int i = 0; i < 10; i++)
    {
      System.out.println("Please insert the grade");
      gradeList.setGrade(i, scanner.nextInt());// method not an array
    }
   System.out.println(gradeList.toString());//this does not work
    System.out.println(gradeList.getGrade(6));
    System.out.println(gradeList.getNumberOfGrades());
    System.out.println(gradeList.getAverage());
  }
}
