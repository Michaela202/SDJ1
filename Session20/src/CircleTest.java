public class CircleTest
{
  public static void main(String[] args)
  {
    Circle circle1 = new Circle(5, 10, 5);
    Point center = circle1.getCenter();
    //circle1.moveCircle(150, 0);

    Circle circle2 = new Circle(155, 10, 5);

    CircleList circleList = new CircleList(3);
    circleList.addCircle(circle1);
    circleList.addCircle(circle2);
    circleList.getAverageArea();
    circleList.getTotalArea();
    for (int i = 0; i < circleList.getNoOfCircles(); i++)
   {
     System.out.println(circleList.getCircle(i) + "\n" + circleList.getAverageArea() + "\n"
         + circleList.getTotalArea());
   }


  }
}
