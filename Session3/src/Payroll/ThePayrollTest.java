package Payroll;

import java.util.Scanner;
public class ThePayrollTest

{
  public static void main(String[] agrs )
  {
    ThePayroll one = new ThePayroll();
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please insert your name");
    String myStr = keyboard.nextLine();
    System.out.println("insert your hourly pay rate");
    double myDbl = keyboard.nextDouble();
    System.out.println("insert the number of hours you worked");
    int myInt = keyboard.nextInt();
    one.setName(myStr);
    one.setNOH(myInt);
    one.setHourlyPayRate(myDbl);
    System.out.println("The person's name is " + one.getName() + " and his/her hourly par rate is " + one.getHourlyPayRate() + " and he/she works for " + one.getNOH() + " hours."
        );



  }
}