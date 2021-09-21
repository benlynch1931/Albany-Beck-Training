import java.io.*;

class ReadFile2 {

  public static void main(String[] args) {

    try {
      // Can throw a checked exception, so we must handle it

      FileInputStream is = new FileInputStream("file1.txt");

      // Establishes connection between source file through various objects
      BufferedReader br = new BufferedReader(new InputStreamReader(is));

      String line;

      while ((line = br.readLine()) != null) { // null indicates end-of-file ("EOF")
        System.out.println(line);
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
