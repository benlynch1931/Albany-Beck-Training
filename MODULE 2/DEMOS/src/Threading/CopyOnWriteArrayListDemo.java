import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

class CopyOnWriteArrayListDemo {

  public static void main(String[] args) {

    List<String> list = new CopyOnWriteArrayList<>();

    list.add("First");
    list.add("Second");
    list.add("Third");

    for(String s : list) {
      System.out.println(s);
      list.add("New item");
    }
    System.out.println(list);
  }
}
