public class Challenge7
{public static void main(String[] agrs)
{
  int numberOfShares = 1000;
  double moneJoeSpendPerShare = 33.87;
  double JoePayed = numberOfShares * moneJoeSpendPerShare;
  double moneyPerSoldShare = 33.92;
  double commission = moneyPerSoldShare * 0.02 * numberOfShares;
  double JoeSold = numberOfShares * moneyPerSoldShare;
  // profit
  System.out.println(JoeSold);
  System.out.println(commission);
  System.out.println(JoePayed);

}
}
//possibly needed to be done with keyboard imput but who cares//