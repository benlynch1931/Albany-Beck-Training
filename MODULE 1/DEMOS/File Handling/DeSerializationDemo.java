import java.io.*;


class Student1 implements Serializable {
  private int id;

  private String name;

  public Student1 (int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return "ID " + this.id + "Name: " + this.name;
  }
}

class DeSerializationDemo {

  public static void main(String[] args) {



    try {

      // Create FileInputStream
      InputStream is = new FileInputStream("StudentObject");

      // Create ObjectInputStream class object

      ObjectInputStream ois = new ObjectInputStream(is);

      Student s1 = (Student) ois.readObject(); // This will de-serialize Student object


      System.out.println(s1);
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
    catch (IOException e) {
      System.out.println(e);
    }
    catch (ClassNotFoundException e) {
      System.out.println(e);
    }
  }
}
