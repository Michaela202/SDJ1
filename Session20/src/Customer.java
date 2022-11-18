public class Customer extends Person
{
  private int customerNo;
  private boolean iWantEmailList;

  public Customer(String name, String address, String telNo, int customerNo,
      boolean iWantEmailList)
  {
    super(name, address, telNo);
    this.customerNo = customerNo;
    this.iWantEmailList = iWantEmailList;
  }

  public int getCustomerNo()
  {
    return customerNo;
  }

  public void setCustomerNo()
  {
    this.customerNo = customerNo;
  }

  public boolean getiWantEmailList()
  {
    return iWantEmailList;
  }

  public void setiWantEmailList(boolean iWantEmailList)
  {
    this.iWantEmailList = iWantEmailList;
  }

  public String toString(){
    return getTelNo() + "\n" + getAddress() + "\n" + getName()+ "\n" + customerNo + "\n" + iWantEmailList;
  }

}
