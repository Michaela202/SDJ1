public class PersonTest
{
  public static void main(String[] args)
  {
    MyDate11 myDate11 =new MyDate11(22,12 ,2002);
    Person person =new Person("Michaela","Kamtjatka", myDate11);
    System.out.println(person.age());
    System.out.println(person.toString());
  }
}
