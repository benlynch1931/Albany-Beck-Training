import java.io.*;

class CreateFile {

  public static void main(String[] args) {

    try {
      // Can throw a checked exception, so we must handle it
      // You can specify the absolute or relative path for the file
      // File is created in `write` mode
      FileOutputStream os = new FileOutputStream("file1.txt");

      // Append mode (add `true` as an argument):
      // FileOutputStream os = new FileOutputStream("file1.txt", true);

      // Compiler will complain as they are characters
      // os.write("Welcome to FileStreams");

      // Can throw a check exception, so we must handle it
      os.write("Welcome to FileStreams".getBytes());
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
    catch (IOException e) {
      System.out.println(e);
    }



  }
}
