# Inner Classes

Inner class can access all members (incl. private) of its enclosing class

Industry Recommendation: declare non-static inner classes as private unless completely necessary
Industry Recommendation: declare static inner classes as public

---

### Types of Inner Classes

1) Non-Static Inner Class (Demo: InnerClassDemo1)

```java 
class Outer {
    
    private class NonStaticInner {
    
    }
    
}
```

2. Static Inner Class (Demo: InnerClassDemo2)

```java 
class Outer {
    
    public static class StaticInner {
    
    }
    
}
```


3) Local Inner Class
    - Encapsulates logic required ***only*** by a specific class
    - These classes act as Helper Classes

    - Cannot be declared as `public` or `static`
```java 
class Outer {
    
    public void localClassMethod() {
        class LocalInnerClass {
    
        }
    }
    
}
```
<br />

Use Case:
```java
class BankLoan {
    
    public class EMICalculator {
        
    }
    
}
```

4. Anonymous Inner Class (Demo: InnerClassDemo4)
   - Declares, Implements and Instantiates Class within same block/statement
```java
interface Calculator {
    
    int add(int a, int b);
    
}

public class CalculatorService implements Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
}

class AnonymousInner {

   public static void main(String[] args) {
       // Industry standard as it embraces polymorphism
      Calculator c1 = new CalculatorService();
      
      System.out.println(c1.add(100, 200)); // Output: 300
   }
    
}
```
Java8 implements a feature called Lambda Expression.
- It acts as an alternative to Anonymous Inner Classes
- Lambda Expression is also known as Anonymous function
  - A function is a block of code which does one and only one task
- Lambda Expression is a way to write more declarative code which looks more elegant than imperative code (legacy code)
- It allows us to write functional-style (functional programming) code
- They can ***only*** be written for functional interfaces

### What are the building blocks of a java method?

1. Access Specifier 
2. Return Type
3. Method Name
4. Parameter List
5. Method Body

According to Lambda Expression, the Java programming infers 1, 2, 3 and 4. What is left is 5 and 6.

### Functional Programming Paradigm uses HOF (Higher Order Function)

- In JavaScript, these are known as CallBacks
- They are dependent on the function arguments *returning* something.

<br />

    `f1(f2(f3(f4())))`
  - Here we send a function as an argument

Object-Oriented Programming Paradigms uses objects

---



