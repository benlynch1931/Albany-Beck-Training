# Type Casting

Type casting is the process of assigning a new *primitive datatype* to a variable.

There are two types:

- Widening Casting
    - This happens automatically when passing a smaller size type into a larger size type
    - byte -> short -> char -> int -> long -> float -> double
```java
    int myInt = 8;
    double mydouble = myInt // Auto type casts from int into double
```

- Narrowing Casting
  - This needs to be explicitly done (manually) when passing a larger size type into a smaller type
  - double -> float -> long -> int -> char -> short -> byte
```java
    double myDouble = 8.14d;
    int myInt = (int) myDouble // Manual type casts from double to int using brackets
```
