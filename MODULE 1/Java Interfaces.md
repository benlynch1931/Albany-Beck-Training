# Java Interfaces

- What is a Java Interface?

  - A specification of method signatures/declarations

  - Interface Methods are abstract by default
    - Don't need to write `abstract` *or* `public`
    - But since Java 8, you should be able to write concrete methods. These methods *MUST* be declared as either `default` or `static`

  - Java Interface represents pure abstract class concept
  - Interfaces *cannot* be instantiated.

  - A class *cannot* extend an interface, it simply `implements` it instead.

  - Variables of Java Interfaces are *always* `public`, `static` and `final`. We don't need to specify this.

  - an interface can ***extend one or more*** interfaces at a time. This is how Java supports indirect/partial multiple inheritance.
  -   Interfaces are not meant for the inheritance concept, they are meant for abstraction.


  - If a class implements an interface, it *must* provide the implementation for **ALL** `abstract` methods of interface. Otherwise the class should be declared as `abstract`.

  - The name of an Interface usually defines the business methods inside.

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

  Ex1:
  ```
    public interface Database {

      // These methods are abstract AND public by default
      void openConnection();
      void close();

    }



    class OracleImpl implements Database {

    }
  ```

  Ex2:
  ```
    interface Printable {
      void printItem();
    }
    interface Returnable {
      void returnItem();
    }
    class Item {

    }

    class Shirt extends Item implements Printable, Returnable {
      @Override
      public void printItem() {

      }

      @Override
      public void returnItem() {

      }
    }

    class ShoppingCart {

      public static void main(String[] args) {

        Shirt redShirt = new Shirt();

        redShirt.printItem();
      }

    }
  ```

## Marker/Tag Interface

- An interface that has no members (no variables or methods)
