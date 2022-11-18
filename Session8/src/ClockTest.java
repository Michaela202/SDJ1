public class ClockTest
{
  public static void main(String[] args){
    Clock clock = new Clock(13,59,30); //psvm , def
    System.out.println(clock.getHour());
    System.out.println(clock.getMinute());
    System.out.println(clock.getSecond());
/*   clock.set(13,1,5);
    System.out.println(clock.getHour());
    System.out.println(clock.getMinute());
    System.out.println(clock.getSecond());
    clock.tic();
    System.out.println(clock.getHour());
    System.out.println(clock.getMinute());
    System.out.println(clock.getSecond());
    System.out.println(clock.convertToSeconds());*/

    Clock clock2 = new Clock(12,57,45);
      System.out.println(clock.isBefore(clock2));
      System.out.println(clock.toString());



  }
}
