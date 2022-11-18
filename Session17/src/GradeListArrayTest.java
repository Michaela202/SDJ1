public class GradeListArrayTest
{
  public static void main(String[] args)
  {
    GradeListArray gradeListArray = new GradeListArray();
    Grade grade1=new Grade("Math", 0);
    Grade grade2=new Grade("Math", 7);
    Grade grade3=new Grade("Math", 2);
    Grade grade4=new Grade("Math", 10);

    gradeListArray.addGrade(grade1);
    gradeListArray.addGrade(grade2);
    gradeListArray.addGrade(grade3);
    gradeListArray.addGrade(grade4);

    System.out.println(gradeListArray.getNumberOfGrades());
    System.out.println(gradeListArray.getAllGradesAsArray());
    System.out.println(gradeListArray.getAllgrades());
    System.out.println(gradeListArray.getAverage());




  }
}
