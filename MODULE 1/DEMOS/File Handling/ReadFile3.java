import java.io.*;

class ReadFile3 {

  public static void main(String[] args) {

    try {
      // Can throw a checked exception, so we must handle it

      FileInputStream is = new FileInputStream("file1.txt");

      // Bridge Class which establishes connection between byte stream and character stream class.
      InputStreamReader isr = new InputStreamReader(is);

      // input to br is a `Reader` class type
      // It requires this as a bridge class between Byte Stream and Character Stream
      BufferedReader br = new BufferedReader(isr);

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
