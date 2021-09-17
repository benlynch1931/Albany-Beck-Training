# Abstract Class vs. Interface

- Abstract class can have both abstract AND concrete methods
- Interface can have *only* abstract methods unless they are declared as default or static


|Abstract Class                   | Java Interfaces                 |
|---------------------------------|---------------------------------|
|Abstract class can have both abstract AND concrete methods| Interface can have *only* abstract methods unless they are declared as default or static|
|Abstract class can have instance variables and constructors | Interfaces can only have `public static final` variables |
|  | Interface is normally used for method's specification re-usability |
| Abstract class restricts extending to *THIS* class only | Interface allows option for extending classes OR implementing multiple interfaces |


Ex:

```java

  interface A {}

  class Impl implements A {

  }

  // allows option for extending a different class

```

```java

  abstract class A {}

  class Impl extends A {

  }

  // cannot extend another class

```
