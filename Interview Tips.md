# Interview Tips and Questions

Like to know about Java, prior to Java 8

------------------------------------------------------------------------------------------

Q: Compiling java file with multiple classes
A: It would create class files for each class in java file

------------------------------------------------------------------------------------------

Q: How many public classes can you have per source file

A: You can only write 1 public class in per source file

------------------------------------------------------------------------------------------

When there is **NO** modifier for methods, the interpreter will complain as it requires a  main method, so must be `public`

------------------------------------------------------------------------------------------

Q: Strongly Typed vs. Weakly Typed datatypes

------------------------------------------------------------------------------------------

Q: why 2 bytes for char, when each character is only 1 byte

A: Java supports UNICODE (Universal Character Set) where there is a possibility for international characters to be stored, so it  reserves 1 byte for these


------------------------------------------------------------------------------------------

Q: Outputs for this code block

`int a = 10;`
`int b = a++;` // POSTFIX

`System.out.println(a)` // Output: ??
`System.out.println(b)` // Output: ??

`int x = 100;`
`System.out.println(x++);` // Output: ???

------------------------------------------------------------------------------------------

Q: Outputs for this code block
```
int a = 10;

if (a == 10) {
  int b = 20;
  System.out.println(a);
}

System.out.println(a);
System.out.println(b);
```

A: Would throw an error as `b` is only available in the block statement.




------------------------------------------------------------------------------------------

Q: Outputs for this code block

```
int i = 1;

while (i <= 10) {

  if (i == 5) {
    continue;
  }
  System.out.println(i);
  i++;
}
```
A: Output 1234555555555555555555....

------------------------------------------------------------------------------------------

Q: What is an object?

A: Combination of **State** and **Behaviour** | (NON-TECHNICAL)

A: Combination of **Variables** and **Methods** | (TECHNICAL)

------------------------------------------------------------------------------------------

Q: What is a Class?

A: A ***Specification/Declaration*** of real-world objects. It does ***Not*** occupy any memory in the run-time environment

------------------------------------------------------------------------------------------

Q: Class vs. Object

A: Class is *plans* for a bridge. Object is the *actual* bridge once built

A: A body (Class) without life (Object)

------------------------------------------------------------------------------------------

Q: Why use `this` in Java?

A: It is a pre-defined reference variable which always refers to instance methods and variables (Class Members)
A: Makes the code more readable
A: Stops local variable hiding the instance variable if they have the same name

------------------------------------------------------------------------------------------

Q: Stack vs. Heap

A:

------------------------------------------------------------------------------------------

Q: What is the benefit of declaring variables as private?

A: Can't randomly be accessed and changed


------------------------------------------------------------------------------------------

Q: Static vs. Non-Static Members

A:


------------------------------------------------------------------------------------------

Q: What is the `this` keyword?

A: non-static reference variable that can only be accessed via non-static methods.


------------------------------------------------------------------------------------------

Q: What is the super class for all Java classes?

A: "Object" -> Default


------------------------------------------------------------------------------------------

Q: Advantages of Inheritance?

A: Code re-usability and maintainability

------------------------------------------------------------------------------------------

Q: Can you write `super()` anywhere in the method?

A: No. it must be the first line, otherwise you are overriding the method.


------------------------------------------------------------------------------------------

Q: What is Method Overriding?

A: A method exists in super class and subclass, with same name and same signature. Method Overriding prioritises the subclass method and leads to Polymorphism.


------------------------------------------------------------------------------------------

Q: What is Method Overloading?

A: Two or more methods with the same name, but different parameters. Here, 'different parameters' means no. of params should be different OR datatypes of params should be different.

EX: `println()`


------------------------------------------------------------------------------------------

Q: What is an Abstract Class?

A: A class which cannot have instances. A class which has 1 or more abstract methods. Creates the specification for sub classes to implement from.


------------------------------------------------------------------------------------------

Q: Why is the `instanceof` operator used?

A: If a variable can be multiple datatypes, you may want to check which datatype it is. Useful with polymorphism.


------------------------------------------------------------------------------------------

Q: What is a Java Interface?

A: Class that represents *pure* abstraction


------------------------------------------------------------------------------------------

Q: Java Interface vs. Abstract class?

A: Abstract class is mainly used to restrict instantiation access
A: Java Interface meant to supple signatures for business methods.

A: Class may need to extend another class - which can't work with abstract classes.


------------------------------------------------------------------------------------------

Q: `extends` or `implements` first?

A: `extends`


------------------------------------------------------------------------------------------

Q: What is a collection?

A: Referred to as a group of objects.


------------------------------------------------------------------------------------------

Q: 3 Interfaces in Java Collections?

A: List, Set, Map. (Find info about each)


------------------------------------------------------------------------------------------

Q: Implementation classes of List?

A: ListArray, LinkedList, Vector, Stack


------------------------------------------------------------------------------------------

Q: What is Auto-Boxing?

A: A process of converting a primitive value into an Object


------------------------------------------------------------------------------------------

Q: What is a Type Inference Diamond?

A: Empty angled brackets used during instantiation of a collection class.


------------------------------------------------------------------------------------------

Q: HashMap vs. Hashtable

A: Hashtable is thread-safe, HashMap is NOT
A: Avoid Hashtable unless you create an application what utilises multi-threading

------------------------------------------------------------------------------------------

Q: What is a String/String Class

A: An immutable class

------------------------------------------------------------------------------------------

Q: What is mutable/immutable class or object?

A: Object cannot be modified once it is created

------------------------------------------------------------------------------------------

Q: Where are String Literals maintained?

A: String Pool inside Heap

------------------------------------------------------------------------------------------

Q: String vs. StringBuffer

A: String immutable, StringBuffer mutable.


------------------------------------------------------------------------------------------

Q: What are "Unchecked Exceptions"

A: Direct subclasses of RunTimeExceptions
A: They need not be handled using try-catch block

------------------------------------------------------------------------------------------

Q: What are "Checked Exceptions"

A: Must be handled by the code using try-catch block


------------------------------------------------------------------------------------------

Q: Who calls the `main` method?

A: JRE

------------------------------------------------------------------------------------------

Q: Classifications of Exception classes?

A: Checked and Unchecked

------------------------------------------------------------------------------------------

Q: What is a Stream (in File Handling)

A: A sequence of Bytes

------------------------------------------------------------------------------------------


Q: What is the difference between Byte Stream Class and Character Stream Class?

A: Byte Stream Classes do not support UNICODE, whereas Character Stream Classes support UNICODE

------------------------------------------------------------------------------------------

Q: What is the role of InputStreamReader in a Java application?

A: It is a Bridge class which establishes a connection between Byte Stream and Character Stream Classes


------------------------------------------------------------------------------------------

Q: What is a transient variable?

A: Value of a transient cannot be serialized


------------------------------------------------------------------------------------------

Q: Types of Inner Classes

A: non-static, static, local and anonymous

------------------------------------------------------------------------------------------

Q: What is a Functional Interface?

A: An interface that defines 1 and ***only*** 1 abstract method

------------------------------------------------------------------------------------------

Q: Types of Java 8 Streams

A: Sequential and Parallel

------------------------------------------------------------------------------------------

Q: What is a Stream Pipeline?

A: combination of one data source, zero ore more intermediate operations, and one terminal operation


------------------------------------------------------------------------------------------

Q: What is a Process (within OS)?

A: A program under execution or a program what has received CPU time


------------------------------------------------------------------------------------------

Q: What is multi-tasking?

A: Performing more than one task


------------------------------------------------------------------------------------------

Q: What is Context Switching?

A: Switching from one memory location to another


------------------------------------------------------------------------------------------

Q: Example of thread method that is guaranteed to run?

A: Thread.sleep(1000);

------------------------------------------------------------------------------------------

Q: What is a Callable interface?

A: It defines a target area for thread just like Runnable, but Callable returns a value back to the caller


------------------------------------------------------------------------------------------

Q: What are concurrent collection classes?

A: Classes that support concurrent programming/execution

A: i.e. ConcurrentHashMap, CopyOnArrayList


------------------------------------------------------------------------------------------

Q: What are/ Why design patterns?

A: Used to produce a re-usable solution
A: To organize code in an efficient way

------------------------------------------------------------------------------------------

Q: What is singleton?

A: Used to create one object per application


------------------------------------------------------------------------------------------

Q: What is a factory method?

A: A method which returns an object of its own class

------------------------------------------------------------------------------------------

Q: Two-Tier Architecture?

A: Two ends. Front-end and Back-end
Ex: A Java application that communicates with a backend Database


------------------------------------------------------------------------------------------

Q: What is JDBC API Architecture?

A:

--------------------------
|       Java app          |
--------------------------
            |
           \|/
--------------------------
|       JDBC API         |
--------------------------
          |
         \|/
------------------------------
|       Driver Manager       |
------------------------------
          |
         \|/
--------------------------
|       Statement         |
|      (Queries)          |
--------------------------
          |
         \|/
-----------------------
|       DATABASE       |
-----------------------


------------------------------------------------------------------------------------------

Q: OCA do we have to install the JDBC Driver manually?

A: From JDBC 4.0 you do not.

------------------------------------------------------------------------------------------

Q: Try-with-resources will automatically close the resources. What order does it do this?

A: Bottom up
