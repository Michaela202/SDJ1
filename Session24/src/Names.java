import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Names
{
  public static void main(String[] args)
  {
    String filename;
    String input;
    PrintWriter write = null;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input the name of the file");
    filename= scanner.nextLine();

    try
    {
      FileOutputStream fileout = new FileOutputStream("Session24/"+filename+".txt");
      write = new PrintWriter(fileout);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    do
    {
      System.out.println("input names");
      input = scanner.nextLine();

      if(!input.equals("DONE"))
        write.println(input);

    }
    while(!input.equals("DONE"));
    write.close();
    System.out.println("Done writing");
  }
}
