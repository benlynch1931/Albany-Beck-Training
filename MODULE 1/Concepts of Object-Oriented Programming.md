# Object Oriented Programming

- Demonstrates Classes and Objects(Instances)

- Better way to organise code
  - Write once, use forever (DRY)

- 4 pillars (principles)
  1. Encapsulation
  2. Inheritance
  3. Polymorphism
  4. Abstraction

- Flexibility
  - Grouping
  - Non-Sequential

- Maintainable
  - Classes must be loosely coupled
  - You must be able to isolate objects for Unit Testing

- Testable
  - either via TDD or after


## Classes

  - A blue-print of real-world objects
  - Collection of methods and variables
  - A ***Specification/Declaration*** of real-world objects
  - A class does ***Not*** occupy any memory in the real-time environment

  - If no Access Specifier is present, the class will be *Package Private* by default.
   - Limited to the folder it is in.

  - You can only have *one* `public` class per file. The filename but also match the name of this public class


## Objects

Objects are a combination of *State* and *Behaviour* || combination of *Variables* and *Methods*
Variables of programming objects represent the state of real-world objects.

It is an *instance* of a class. It is unique.

***All instance variables have a default value of NULL***

- Garbage Collection (or GC) is in charge of Object life cycle
  - It may remove objects if not assigned upon instantiation
  - The lifetime of Objects depend on its scope.
    - If there is a reference (is a local variable), the variable will be eligible for GC after the closing curly brace.
    - If there is NO reference (not a local variable), the variable will be eligible for GC immediately.

E.G.

### Employee
- State
  - name
  - age
  - id
  - title
  - password

- Behaviour
  - writeCode()
  - signIn()
  - checkEmail()
  - register()


## Steps followed in OOP:

1. Create a class

  ```
  class Employee {

    int id;
    String name;
    String email;

  }
  ```
  [Access Specifier is optional]

2. Instantiate class/create object

  `<ClassName> objectName = new <ClassName>([arguments])`
  ```
  Employee benLynch = new Employee();
  ```

3. Accessing members/objects of class

  ```
  benLynch.writeCode();
  benLynch.id = 100;
  ```

## Constructor Method

- Constructs objects
- Cannot be static
- Similar to a method but lacks return type
- Constructor will have same name as class name
- Will be invoked immediately on instantiation of class/creation of class object.
- A class can have one or more constructors

- Default vs Parameterized Constructors
  - If a class has ZERO explicit constructors, the compiler will add a *default* constructor which takes no parameters
  - If a developer writes a constructor explicity, the compiler will NOT add a default constructor.

- Ability to use IllegalArgumentException when instantiating a class
  - Recommended to use try/catch blocks to display nicer and cleaner error!

- Recommended to add a default constructor with no arguments when dealing with inheritance.
  - Prevents errors during super().

```
  class Employee {

    public Employee(String hairColour) {
      this.hairColour = hairColour;
    }

  }

```


## Methods

- A block of code which can be written once and called many times

- If no Access Specifier is present, the method will be *Package Private* by default.
 - Limited to the folder it is in.

- Methods are referred to as workers. Ready to do some job
- Callers are referred to as managers

`[Access Specifier] returnType methodName ([parameterList])`

```
public void setId(int id) {
  this.id = id;
}

public int getId() {
  return this.id;
}
```

### Static Members

- Methods and Variables which belong to/bound with the Class and not the Object/Instance.
  - AKA Global Members
- They can only access static data.
- Known as shared member across all instances/objects

- All static members are maintained in a special block called *"Static Block"*.
  - It is stored in Heap in its own little section.
  - It is exempt from Garbage Collection.

- option to use `final` keyword alongside `static`, to make member a constant and read-only.

- They are useful as they can be **called without instantiating the class**.
  - You reference them by the classname itself *OR* to the object of the class.
  - Some IDEs will show a warning when referencing via the object as it is misleading to the reader.

  ```
    <ClassName>.<staticMethodName>;
    objectName.staticMethodName;
  ```

  ```
    class StaticDemo {
      public static void staticMethod () {
        System.out.println("Static Method here!")
      }
    }

    StaticDemo.staticMethod(); // Output: 'Static Method here!'

    StaticDemo demoObject = new StaticDemo();
    demoObject.staticMethod(); // Output: 'Static Method here!'

  ```

### Non-Static Members

- Methods and Variables bound to the object/instance of the class.

- Cannot be accessed without creating an object
  - Must be accessed using instances/objects/reference name

- `this` is a non-static reference variable that cannot be accessed in Static Methods.
  - It is only required to ***Access*** the variable, not declare.


## Variables

- variables can be made Constant (read-only) by prefixing with `final`.

`final int DEFAULT_CAPACITY;`


## Public vs. Private vs. Protected Members

| Modifier                | Class | Package (folder) | Subclass | Global |
|-------------------------|-------|------------------|----------|--------|
| public                  | Y     | Y                | Y        | Y      |
| protected               | Y     | Y                | Y        | N      |
| private                 | Y     | N                | N        | N      |
| default(package-private)| Y     | Y                | N        | N      |

Class: 
- Does the class have access to its members?

Package:
- do classes in same package have access to the members?

Subclass:
- do subclasses of main class outside the package have access to the members?

Global:
- do all classes have access to the members?