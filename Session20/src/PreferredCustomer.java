public class PreferredCustomer extends Customer
{
  private double purchase;
  private double discount;

  public PreferredCustomer(String name, String address, String telNo,
      int customerNo, boolean iWantEmailList, double purchase)
  {
    super(name, address, telNo, customerNo, iWantEmailList);
    this.purchase = purchase;
    if(purchase<500){
      this.discount=0;
    }
    else if (purchase<1000){
      this.discount=5;
    }
    else if (purchase<1500)
    {
      this.discount=6;
    }
    else if (purchase<2000)
    {
      this.discount=7;
    }
    else
      this.discount=10;
  }

  public double getDiscount()
  {
    return discount;
  }

  public void setDiscount(double discount)
  {
    this.discount = discount;
  }

  public double getPurchase()
  {
    return purchase;
  }

  public void setPurchase(double purchase)
  {
    this.purchase = purchase;
  }


  public String toString()
  {
    return super.toString() +"\n"+ purchase+"\n" + discount;
  }
}
