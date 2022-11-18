import java.util.Scanner;
public class BookTest

{
  public static void main(String[] agrs)


  {
    Book first = new Book();
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please insert the name of an Author");
    String author = keyboard.nextLine();
    System.out.println("Please insert the title of the book");
    String nameOfBook = keyboard.nextLine();
    System.out.println("Please insert the number of Pages");
    int numberOfPages = keyboard.nextInt();
    System.out.println("Please insert the price");
    double price = keyboard.nextDouble();
    keyboard.nextLine();
    Book second = new Book();
    System.out.println("Please insert the name of an Author");
    String author2 = keyboard.nextLine();
    System.out.println("Please insert the title of the book");
    String nameOfBook2 = keyboard.nextLine();
    System.out.println("Please insert the number of Pages");
    int numberOfPages2 = keyboard.nextInt();
    System.out.println("Please insert the price");
    double price2 = keyboard.nextDouble();
    double finalPrice1 = price * 0.8;
    double finalPrice2 = price2 * 0.8;
    System.out.println(author +" "+ nameOfBook +" "+ numberOfPages +" "+ finalPrice1);
    System.out.println(author2 +" "+ nameOfBook2 +" "+ finalPrice2 +" "+ numberOfPages2);
  }

}
