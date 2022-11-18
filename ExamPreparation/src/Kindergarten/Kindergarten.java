package Kindergarten;

import java.util.ArrayList;

public class Kindergarten
{
  private int countTeachers;
  private ArrayList<Child> child1;

  public Kindergarten()
  {
    child1 = new ArrayList<>();
    this.countTeachers = 0;
  }

  public void addChild(Child child)
  {
    child1.add(child);
  }

  public void removeChild(Child child)
  {
    child1.remove(child);
  }

  public void hireTeachers(int count)
  {
    int total = countTeachers + count;
  }

  public void fireTeacher()
  {
    countTeachers--;
  }

  public int countChildren()
  {
    return child1.size();
  }

  public int countTeachers()
  {
    return countTeachers();
  }

  public double getAverageChildAge()
  {
    int total = 0;
    for (int i = 0; i < child1.size(); i++)
    {
      total += child1.get(i).getAge();
    }
    return (double) total / child1.size();
  }

  public double getNorm()
  {
    return child1.size() / countTeachers;
  }

  public void celebrateBirthday(String name)
  {
    // what is going on here
  }

  public String toString()
  {
    String temp = "";
    for (int i = 0; i < child1.size(); i++)
    {
      temp+= child1.get(i) + "\n";
    }
    return temp;
  }
}
