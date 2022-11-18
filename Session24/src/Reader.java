import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader
{
  public static void main(String[] args)
  {
    Scanner read = null;
    try
    {
      FileInputStream fileIn = new FileInputStream("Session24/f.txt");
      read = new Scanner(fileIn);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    System.out.println("Text in file:");
    while (read.hasNext())
    {
      System.out.println(read.nextLine());
    }
    read.close();
  }
}
