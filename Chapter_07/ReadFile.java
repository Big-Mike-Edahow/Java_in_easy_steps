// ReadFile.java

import java.io.*;

class ReadFile
{
  public static void main (String[] args)
  {
    try
    {
      FileReader file = new FileReader("Oscar.txt");

      BufferedReader buffer = new BufferedReader(file);

      String line = "";
      System.out.print("\n");

      while ((line = buffer.readLine()) != null)
      {
        System.out.println(line);
      }

      buffer.close();
      System.out.print("\n");
      
    } catch (IOException e)
    {
      System.out.println("A read error has occurred.");
    }
  }
}

