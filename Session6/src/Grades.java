import java.util.Scanner;
public class Grades
{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please insert a grade (Danish grading system = 12, 10, 7, 4, 2, 0, -3");
    int grade = keyboard.nextInt();
    if(grade == 12)
      System.out.println("A");
    else if (grade == 10)
    System.out.println("B");
    else if (grade == 7)
      System.out.println("C");
    else if (grade == 4)
      System.out.println("D");
    else if (grade == 2)
      System.out.println("E");
    else if (grade == 0)
      System.out.println("Fx");
    else if (grade == -3)
      System.out.println("F");


  }
}
