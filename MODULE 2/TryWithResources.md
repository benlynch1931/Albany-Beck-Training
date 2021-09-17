




```java

  class A implements AutoCloseable {
    public void close() {
      System.out.println("Closing");
    }
  }

  class B implements AutoCloseable {

    public void close() {
      System.out.println("Closing");
    }
  }

  class TryWithResource{

    public static void main(String[] args) {

      // Does not require a catch block as there is no checked Exception
      // Does not require a finally block the finally is replaced with the `withResources`
      try(
        A a1 = new A();
        B b1 = new B();
      )
    }
  }

```
