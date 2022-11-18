public class AnimalTest
{
  public static void main(String[] args)
  {
    Animal[] animals= new Animal[3];
    animals[0] = new Frog(10, "red");
    animals[1] = new Dog(5, "Beny", "dog");
    animals[2] = new Cat(8,"kitty", true);
    //for (int i = 0; i < animals.length; i++)
   //{
      //System.out.println(animals[i].speak());
      System.out.println(animals[2].toString());
   // }
  }
}
