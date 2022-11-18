
public class Person
{
  private String name;
  private String birthday;
  public Person(String name1 ,String birthday1){
    this.birthday = birthday1;
    this.name = name1;
  }
 public Person(){
    name = "Michaela";
    birthday ="22/12/2002" ;
 }
  public void setBirthday(String birthday)
  {
    this.birthday = birthday;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String toString()
  {
    return name +" "+birthday;
  }

}
