import java.io.*;

class ReadFile1 {

  public static void main(String[] args) {

    try {
      // Can throw a checked exception, so we must handle it

      FileInputStream is = new FileInputStream("file1.txt");

      int i;

      while ((i = is.read()) != -1) { // -1 indicates end-of-file ("EOF")
        System.out.print((char) i);
      }
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
    catch (IOException e) {
      System.out.println(e);
    }



  }
}
