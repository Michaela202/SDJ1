public class JobTest
{
  public static void main(String[] agrs){
    Job myjob = new Job("CEO",55);
    Job myjob2 = new Job();
    System.out.println(myjob.getMonthltSalary());
    myjob.givePercentageRaise(0.2);
    System.out.println(myjob.getMonthltSalary());
  }




}

