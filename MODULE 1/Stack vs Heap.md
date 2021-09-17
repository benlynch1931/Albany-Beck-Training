#Stack vs. Heap

### Stack

- Structured! So faster than Heap
- Stores the information or details of local variables
- Maintains local variables including parameters of methods

- The objects remain in Head, but have location reference in stack


### Heap

- Memory location in JVM where all Java objects exist
- Remote memory location
- Random Object location

```
  new Employee(); // Creates an object in Heap
```



## Object Lifecycle


```
  new Employee(); // Eligible for GC here!

```

```
  public static void main () {


    Employee e1 = new Employee();


  } // e1 is eligible for GC here!
```

```
public static void main () {


  Employee e2 = getEmployee();


} // e2 (was e1) is eligible for GC here!

public Employee getEmployee() {
  Employee e1 = new Employee();

  return e1;
} // e1 now has a new reference point so is NOT eligible for GC
```
