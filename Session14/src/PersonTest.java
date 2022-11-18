public class PersonTest
{
  public static void main(String[] args)
  {
    MyDate11 myDate11 =new MyDate11(22,12 ,2002);
    Person person =new Person("Michaela","Kamtjatka", myDate11);
    person.rememberThis(null);
   // person.rememberThis("JavaJavaJava2");
   // person.rememberThis("JavaJavaJava3vjvbmvbnvb");
    System.out.println(person.getIQ());
   System.out.println(person.isBrainDamaged());
  // System.out.println(person.doYouRemember("JavaJavaJava2"));
  //  System.out.println(person.whatAreYouThinkingAbout());
  // System.out.println(person.toString());

  }
}
