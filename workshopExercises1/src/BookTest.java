public class BookTest
{
  public static void main(String[] args)
  {
    Book book= new Book("Matilda",1958);
    Book book1 = new Book("Bible",0000);
    System.out.println(book);
    System.out.println(book1);
    System.out.println("Are those the same book ?" + "\n" + book.equals(book1));
  }
}
