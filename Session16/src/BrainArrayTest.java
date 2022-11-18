public class BrainArrayTest
{
  public static void main(String[] args)
  {
    PersonBrainArray p1 = new PersonBrainArray("jhf", "gfg", new MyDate11(11,11,11));
    String k="aaaaaaaaaaaaaaaaaaaaaaa";
    p1.rememberThis(k);
   p1.rememberThis("jajajajajajajajaj");
    p1.rememberThis("jajajajajajajajaja");
    System.out.println(p1.isBrainDamaged());
    System.out.println(p1.getIQ());

//to test the brainclass done with arrays we always need the person who has the brain
  }
}
