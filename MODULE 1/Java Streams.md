# Streams in Java 8

- A sequence of objects

- Streams deal with group of objects not with individual objects
    - Adds performance when dealing with large data sets


## Streams are classifies into two types:
  
**Sequential Streams**
- Deterministic - order of objects stays the same
- Best for if you want to maintain order of objects

```java
List<String> names = arrays.asList("Ben", "Will", "Kishore");

names.stream();
```
<br />
<br />

**Parallel Streams (Multi-Threads)**
- Non-Deterministic - order of objects may change as it utilises multiple streams
- Here, Streams would be divided into subset of Streams and process them separately and the results would be merged

- Parallel Streams use Fork-Join Framework, under the hood.

```java
List<String> names = arrays.asList("Ben", "Will", "Kishore");

names.parallelStream();
```

What is a Stream Pipeline?

- Combination of
    1. ***One*** data source
    2. *Zero or more* intermediate operations
    3. ***One*** Terminal operation

  Ex:
```java
    List<String> names = arrays.asList("Ben", "Will", "Kishore");
        .filter(name -> name.startsWith("B")) // DATA SOURCE
        .forEach(name -> System.out.println(name)); // INTERMEDIATE OPERATION
        .forEach(name -> System.out.println(name)); // TERMINAL OPERATION
```