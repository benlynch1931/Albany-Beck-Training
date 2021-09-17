# 4 Pillars of Object-Oriented Programming

## Encapsulation

- Process of wrapping or combining of variables and methods into a logical unit (Class)
- Must ensure all variables of class are *private*
- Methods should be declared as public
  - The variables within the methods are still private so cannot be accessed!





## Inheritance

- Process of creating a new class from an existing class.
- Here, the new class is called as a "subclass/child/derived". The existing class is called as the "superclass/parent/base".

- All java classes extend "Object" class by default

- Write methods or variable that define the subclass as special/different

- When creating a new constructor, consider adding the arguments from the Parent Constructor.

### Types of inheritance

1. Single
  - one Subclass extending one Superclass
2. Multi-level
  - Subclass of a Subclass of a Subclass of a Superclass etc.
3. Hierarchical
  - More than one child class per level for 1 parent class

- Java does ***Not*** support Multiple Inheritance OR Hybrid Inheritance.

```
  class <ParentClass> {

  }

  class <ChildClass> <extends> <ParentClass> {

  }


  ex:

  class Employee {

    private int id;
    private String name;

    public Employee (String name, int id) {
      this.id = id;
      this.name = name;
    }

    @Override
    public String toString () {
      return "ID " + this.id + "Name" + this.name + " Skills " + this.skills
    }
  }

  class Developer extends Employee {

    private String language;

    public Developer (String name, int id, String language) {

      super(name, id) // Calls constructor in parent class // Must be the first statement.
      this.language = language;

    }
    @Override
    public String toString () {
      <!-- To access the variables in parent class, you just add the super method to the return -->
      return super.toString() + " Skills " + this.skills
    }
  }

  Developer d1 = new Developer("Ben", 1, "ben@example.com");
  System.out.println(d1); // Compiler converts to: System.out.println(d1.toString())


```

Advantages:
- Code Re-usability
- Code Maintainability

- Code Efficiency

To make overriding methods easier to read, we use annotations (from Java5+).
We write `@Override` the line above the method declaration
- It triggers the compiler to check if the method exists in the super class
- A way of ensuring we are overriding and not creating a new method
- Can be considered a guard clause to protect from unnecessary overheads during run-time.





## Abstraction

- Hiding unnecessary details and showing *ONLY* the required details.

- Provides a *specification* for all sub classes. It doesn't care how the implementation is provided.
  - Should make a super class with common methods etc. and let sub classes deal with the implementation.

- Real-World Examples:
  - Mobile Phone -> displays keyboard. Buttons for volume
  - Brain
  - Laptop

- Abstract Classes:

  1. A class which cannot have instances
    - Great way to prohibit accidental instantiation of wrong class.

  2. A class which has *one or more* abstract methods
    - It may have implemented/concrete classes as well

  3. A class which is not fully implemented
    - There is a declaration, but not implementation (Method name exists, but no functionality)

  - Generally, the super class is abstract.

  - Saves space
  - Restrict Developers from instantiating class.
  - *It stops the compiler adding `super()`. You MUST add it explicitly*

  - Recommended to add a default constructor with no arguments when dealing with inheritance.
    - Prevents errors during super().

  - An abstract class can have a reference, which can refer to all of its subclass objects. But not vice versa (subclass cannot refer to super class object).
    - You can  use the same variable for all subclasses.

  ```
  abstract class <CLASSNAME> {

    public abstract void getConnection();

    public abstract void turnOn();
  }
  ```


- Abstract Method?

  1. A method without body ({})
  2. A method reveals its signature (name, return type etc.), but NOT underlying implementation (body)

  - You MUST tell the compiler the method is abstract using the `abstract` keyword.

  - When method overriding is obvious, its not worth implementing the methods in the super class.

  `public abstract void getConnection();`

  `public abstract void turnOn();`

  `public abstract void turnOff();`

  ```

  abstract class ElectronicDevice {

    public abstract void turnOn();

    public abstract void turnOff();
  }

  class TV {

    public void turnOn() {
      System.out.println("TV is turning on...");
    }

    public void turnOff() {
      System.out.println("TV says Goodbye!");
    }

  }

  class MobilePhone {
    public void turnOn() {
      System.out.println("Mobile Phone is turning on...");
    }

    public void turnOff() {
      System.out.println("Phone says Goodbye!");
    }
  }

  ```

  Creating reference for super class to point to all subclasses:
    - you couldn't use ed for MobilePhone if datatype is TV, however, is datatype is ElectronicDevice, TV AND MobilePhone is a datatype available

  ```
    ElectronicDevice ed = new TV();

    ed.turnOn();

    ed = new MobilePhone();

    ed.turnOn();

  ```






## Polymorphism


```
  public void operateTV(TV t) {

  }

  public void operateMobilePhone(MobilePhone m) {

  }

  public void operateLaptop(Laptop l) {

  }
```
Can be written as:

```
public void operateElectronicDevice(ElectronicDevice ed) {

  ed.turnOn(); // Would use the method body for which ever electronic device is passed as an argument.

}
```

You might want to perform a specific action depending on which object has been passed through:

```
public void operateElectronicDevice(ElectronicDevice ed) {

  if (ed instanceof TV) {
    ed.turnOn();
  }
  else if(ed instanceof MobilePhone) {
    ed.ringMum();
  }

}
```
