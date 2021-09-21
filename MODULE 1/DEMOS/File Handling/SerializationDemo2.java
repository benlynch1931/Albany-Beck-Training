import java.io.*;


class Student2 implements Serializable {
  private int id;

  private transient String name;

  public Student2 (int id, String name) {
    this.id = id;
    this.name = name;
  }

  public String toString() {
    return "ID " + this.id + "Name: " + this.name;
  }
}

class SerializationDemo2{

  public static void main(String[] args) {
    Student s1 = new Student(1, "Kishore");

    // Create FileOutputStream

    try {


      OutputStream os = new FileOutputStream("StudentObject");

      // Create ObjectOutputStream class object

      ObjectOutputStream oos = new ObjectOutputStream(os);

      oos.writeObject(s1); // This will serialize Student object


      System.out.println("Object has been Serialized");
    }
    catch (FileNotFoundException e) {
      System.out.println(e);
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
}
