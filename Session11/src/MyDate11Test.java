public class MyDate11Test
{
  public static void main(String[] args)
  {

    /*11.04
    MyDate11 myDate11 =new MyDate11();
    MyDate11 myDate111 =new MyDate11(1,1,2023);
    System.out.println(myDate11.idBefore(myDate111)); */

//11.03
   // System.out.println(MyDate11.today());
    //11.02
  /*  MyDate11 myDate11=new MyDate11(22,12,2002);
    System.out.println(myDate11);

    myDate11.nextDays(100);
    System.out.println(myDate11);*/
    // c
    /*MyDate11 myDate1 = new MyDate11(22,12,2002);
    MyDate11 myDate2 = new MyDate11(myDate1);
    System.out.println(myDate2);*/


    //b
    /*MyDate11 myDate11 = new MyDate11(22,12,2002);
    MyDate11 myDate111= myDate11.copy();
    System.out.println(myDate111);*/

  //a
    MyDate11 myDate11 = new MyDate11();
    MyDate11 myDate111= new MyDate11();

    if(myDate11.equals(myDate111))
    {
      System.out.println("The date is the same");
    }
    else
    {
      System.out.println("The date is not the same");
    }
  }
}

