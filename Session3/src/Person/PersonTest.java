package Person;

public class PersonTest

{
  public static void main( String[] args)
  {
    Person person = new Person();
    Person guy = new Person();
    person.setName("Mariana");
    person.setBirthday("December");
    guy.setName("Jan");
    guy.setBirthday("February");
    System.out.println("the first person name is " + person.getName() + " and her/his birthsday is in " + person.getBirthday());
    System.out.println("the second person name is " + guy.getName() + " and her/his birthsday is in " + guy.getBirthday());


  }
}
