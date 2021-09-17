# Java Built-In methods

- Implementation classes should be suffixed with `Impl`
  - `class DatabaseImpl {}`


## toString()

- Method in the Object class, that all Java classes inherit.
- It returns the hash-code (address) of THAT object.
  - It is the details of location provided in Heap Memory.

- Can be overriden.
  - Even when overriden, you don't need to call the method specifically (see below).

If you type:
```
  Developer d1 = new Developer("Ben", 1, "ben@example.com");
  System.out.println(d1);
```
The compiler automatically adds a method to `d1`, and makes it:
```
  System.out.println(d1.toString())
```

The statement is ***implicitly*** referencing the toString() method.


## Method Overloading

- Two or more methods with the same name, but different parameters.
  - The return type has NO effect.

- Different ***Versions*** of the method.

- Can prevent unnecessary errors.

- Here, different parameters means:

  1. Number of parameters is different
  2. Datatypes of parameters is different.

  ```

  class MethodOverloading {

    public void add(int a, int b) {
      System.out.println(a+b);
    }

    public void add(double a, double b) {
      System.out.println(a+b);
    }
  }

  ```

  Real-World example:

  `System.out.println(100);`
  `System.out.println("Hello");`
  `System.out.println(true);`

  - Connecting to DB. Might not need user and password. So only needs the URL.



## Java Interfaces

- What is a Java Interface?

  - A specification of method signatures/declarations

  - Interface Methods are abstract by default
    - Don't need to write `abstract` *or* `public`
    - But since Java 8, you should be able to write concrete methods. These methods *MUST* be declared as either `default` or `static`

  - Java Interface represents pure abstract class concept

  - A class *cannot* extend an interface, it simply `implements` it instead.

  - Variables of Java Interfaces are *always* `public`, `static` and `final`. We don't need to specify this.

  - an interface can extend one or more interfaces at a time. This is how Java supports indirect/partial multiple inheritance.
  -   Interfaces are not meant for the inheritance concept, they are meant for abstraction.


  - If a class implements an interface, it *must* provide the implementation for **ALL** `abstract` methods of interface. Otherwise the class should be declared as `abstract`.

  Syntax:
  ```
    [Access Specifier] interface <interfaceName> {

      List of constant variables (always public, static and final)

      List of abstract methods (don't need keyword)

      // Since Java 8:
      List of default methods (don't need to be implemented/overridden)

      List of static methods (don't need to be implemented/overridden)
    }
  ```

  Ex:
  ```
    public interface Database {

      // These methods are abstract AND public by default
      void openConnection();
      void close();

    }



    class OracleImpl implements Database {

    }
  ```
