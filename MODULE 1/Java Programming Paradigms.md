# Programming Paradigms

### Imperative Programming Paradigms

- Write code that describes *how* you will get what you want.


### Declarative Programming Paradigms

- Write code that describes *what* you want, but not necessarily how to get it

- For part of the program to be more declarative, other parts must provide the abstraction to hide the implementation details


### Functional Programming Paradigms

- Passing functions/methods to other methods as arguments
- In JavaScript, this is referred to as CallBacks
```java
class FunctionalParadigm {

    public static void main(String[] args) {

        function1(function2(function3(function4())));

    }

    public static void function1(String string) {
        System.out.println("function1\n");
        System.out.println(string);
    }

    public static String function2(String string) {
        System.out.println("function2");
        return "2" + string;
    }

    public static String function3(String string) {
        System.out.println("function3");
        return "3" + string;
    }

    public static String function4() {
        System.out.println("function4");
        return "4";
    }
}

// Output:

// function4
// function3
// function2
// function1
//
// 234
```

<br />

### Object-Oriented Programming Paradigms

- Passing objects to methods as arguments

```java
FileInputStream is = new FileInputStream("file1.txt");

// Establishes connection between source file through various objects
BufferedReader br = new BufferedReader(new InputStreamReader(is));
```
