public class WiseMan
{
  public static void main(String[] args){
double grains = 1;
    double totalAmount = 1;
    for(int i = 2; i<=64 ; i++) //the 3rd one has to be written as an equation
    {
      grains=2*grains;
      totalAmount = totalAmount+grains;
    }
    System.out.println(grains);
    System.out.println(totalAmount);
  }
}
