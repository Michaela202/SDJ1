public class TestVehicle
{
  public static void main(String[] args)
  {
    Van van1 = new Van("Oliwier", 12000, "TJE55045", 120);
    Van van2 = new Van("Oliwier", 12000, "TJE55045", 120);
    System.out.println(van1);
    System.out.println(van1.equals(van2));

    SportsCar sportscar1 = new SportsCar("Oliwier", 150000, "500", 350);
    SportsCar sportscar2 = new SportsCar("Oliwier", 150000, "500", 350);
    System.out.println(sportscar1);
    System.out.println(sportscar1.equals(sportscar2));

    Bicycle bicycle1= new Bicycle("Michaela", 10000, 45);
    Bicycle bicycle2= new Bicycle("Michaela", 10000, 25);
    System.out.println(bicycle2);
    System.out.println(bicycle2.equals(bicycle1));
  }
}
