import java.util.*;

class ArrayListDemo1 {

  public static void main (String[] args) {

    // Prior to Java 5:
    ArrayList list1 = new ArrayList();

    list1.add(new Integer(1000));

    // Subsequent to Java 5:

    list1.add("Ben"); // Converts from string literal to String object
    list1.add(true); // Converts from boolean to Boolean object
    list1.add(9.99); // Converts from double to Double object

    ArrayList <Integer> list2 = new ArrayList<Integer>();

    list2.add(10); // Converts from int to Integer object

    // Subsequent to Java 7:
    ArrayList <Integer> list3 = new ArrayList<>(); // Type Inference Diamond


    System.out.println(list); // Ouput: [10, "Ben", true, 9.99]

    for(Object i : list) {
      System.out.println(i); // Output: 10 \n "Ben" \n true \n 9.99
    }

    // Iterate through ArrayList using Iterator

    Iterator it = list1.iterator(); // Iterator is an interface defined in java.util
    // If you know all Objects in ArryList are the same:
    Iterator <Integer> it2 = list2.iterator();

    while(it.hasNext()) {
      // Have to type it.next() first to get the next element
      Integer value = (Integer) it.next(); // Iterator points to space above first element, so it.next() selectes first element

      System.out.println(value);
    }
  }
}
