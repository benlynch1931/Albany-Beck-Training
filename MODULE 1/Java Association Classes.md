# Association Classes


What are the types of associations/relationships classes can have?

1. Is-a relationship (Inheritance)

2. Has-a relationship (Aggregation OR Composition)

```java

  class Employee {
    // Class Dependancy
    private Address address; // Declaring a field establishes a `has-a` relationship
  }

  class Address {

  }
```
-> Employee has an address


`System.out.println("Welcome");`

->

```java

  public class System {
    public static PrintStream out; // Has-a relationship
    public static InputStream in; // Has-a relationship
  }

  public class PrintStream {
    public void println(String s) {}
    public void println() {}
  }

```

## Aggregation and Composition

- Aggregation
  - Object can exist on its own
  - i.e. Vehicle and Engine -> engine can be removed and fixed elsewhere

- Composition
  - Object cannot exist without other objects
  - i.e. body can't exists without a hand, hand can't exist without body

```java
class Body {
  Hand h;
}

class Hand {

}
```
