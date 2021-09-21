import java.io.*;


class Student implements Serializable {
  private int id;

  private String name;

  public Student (int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return "ID " + this.id + "Name: " + this.name;
  }
}

class SerializationDemo {

  public static void main(String[] args) {
    Student s1 = new Student(1, "Kishore");

    // Create FileOutputStream

    try {


      OutputStream os = new FileOutputStream("StudentObject");

      // Create ObjectOutputStream class object

      ObjectOutputStream oos = new ObjectOutputStream(os);

      oos.writeObject(s1); // This will serialize Student object


      System.out.println("Object has been Serliazed");
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}
