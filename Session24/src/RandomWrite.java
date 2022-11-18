import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;

public class RandomWrite
{
  public static void main(String[] args)
  {
    int bound = 0;
    Scanner scanner = new Scanner(System.in);
    Random r =new Random();
    System.out.println("How many numbers do you want to store?");
    bound = scanner.nextInt();
    try
    {
      FileOutputStream fileOut = new FileOutputStream("Session24/random.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOut);
      for (int i = 0; i < bound; i++)
      {
        write.writeInt(r.nextInt(100));
      }
      write.close();
    }
      catch(FileNotFoundException e)
      {
        System.out.println("File not found, or could not be opened");
        System.exit(1);
      }
      catch(IOException e){
      System.out.println("IO Error writing to the file");
      System.exit(1);
    }
      System.out.println("Done writing");
    }
  }
