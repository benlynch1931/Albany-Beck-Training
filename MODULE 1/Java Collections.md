# Java Collections

AKA Collection Framework

A Java Collection is a *group* of *objects*

Collections operate on Object only (No primitives - Integer not int)

Collections are *Dynamic* and **Growable in length**


**3 Interfaces in Java Collections:**

1. List
  - Index-based Collection, which allows duplicates.
  - It focuses on index


2. Set
  - Hash(memory)-based Collection, which **does not allow duplicates.**
  - It focuses on Hashing (of object in memory) and uniqueness.


3. Map
  - Based on key-value pairs of objects.
  - Cannot be primitive values.

  - Key objects are hash-coded, that means keys must be unique
  - Value objects can be duplicated

  - `HashMap<String, Integer> scores = new HashMap<>();`

  - `put` not `add`



### **Implementation classes of List interface**

- ArrayList

  - Index-Based
  - Ordered but not sorted


  - Suitable for search operations because of indexing
  - NOT suitable for updates and modifications (deleting objects)

  What is a Generic class?
  `<Integer>`
  - Declaration is represented by angled brackets (`<>`)
  - Offers Type-Safety and avoids explicit type-casting

  Syntax:

  - Java 1-5:
  ```java
    ArrayList list1 = new ArrayList();
  ```

  -Java 5-7:
  ```java
  ArrayList <Integer> list2 = new ArrayList<Integer>();
  ```

  - Java 7+:
  ```java
  ArrayList <Integer> list2 = new ArrayList<>();
  ```




- LinkedList

  - Node() based collection
    - A Node is a Object that has been fused with the previous object address and the next object address

  - Has to traverse through nodes to find object


  - Suitable for add operations
    - Object can be added at any location as address-based
  - NOT suitable for reading



- Vector

  - Index-Based (Similar to ArrayList)
  - Expensive Object because Vector is synchronized (thread-safe)



### **Implementation classes of Set interface**

- HashSet

  - Based on Hashing
  - Eliminates Duplication

  - Ordered? NO
  - Sorted? NO



- LinkedHashSet

  - Organises objects based on insertion order
  - Eliminates Duplication

  - Ordered? YES - by insertion order
  - Sorted? NO



- TreeSet

  - It maintains sorted collection
  - Eliminates Duplication

  - Ordered? YES - By natural order procedure (Ascending order)
    - You would have to write you own comparators for custom orders
  - Sorted? YES



### **Implementation classes of Map interface**

*Deals with Key-Value Pairs*

- HashMap

  - Based on Hashing
  - Eliminates duplicate Key Objects (Overrides existing Key/Pair value)
    - Overrides

  - Ordered? NO
  - Sorted? NO



- LinkedHashMap

  - Organises objects based on insertion order (Key Objects only)
  - Eliminates duplicate Key Objects (Overrides existing Key/Pair value)
    - Overrides

  - Ordered? YES - by insertion order
  - Sorted? NO



- TreeMap

  - Maintains sorted collection

  - Ordered? YES - By natural order procedure (Ascending order)
    - You would have to write you own comparators for custom orders
  - Sorted? YES



- Hashtable

  - Expensive Object
  - Similar to HashMap, but is synchronized!

  - Ordered? NO
  - Sorted? NO

  - Avoid Hashtable unless you create an application what utilises multi-threading



## **Iterating Collections**

- Iterating Lists

  - <a href='#ArrayListIterating'>ArrayList</a> 
  - <a href='LinkedListIterating'>LinkedList</a>
  - <a href='VectorIterating'>Vector</a>

<a name="ArrayListIterating" ></a>
```java 
  ArrayList <Integer> integerList = new ArrayList<>();
  integerList.add(1);
  integerList.add(2);
  integerList.add(3);
  integerList.add(4);
  
  for(int i = 0; i < integerList.size(); i++) {
    System.out.println(integerList.get(i);
  }
  // Output: 1 2 3 4
  
  for(int integer : integerList) {
    System.out.println(integer);
  }
  // Output: 1 2 3 4 
  
  Iterator <Integer> listIterator = integerList.iterator();
  
  while(listIterator.hasNext()) {
    System.out.println(listIterator.next());
  }
  // Output: 1 2 3 4
```


<a name="LinkedListIterating" ></a>
```java 
  LinkedList <Integer> integerList = new LinkedList<>();
  integerList.add(1);
  integerList.add(2);
  integerList.add(3);
  integerList.add(4);
  
  for(int i = 0; i < integerList.size(); i++) {
    System.out.println(integerList[i]);
  }
  // Output: 1 2 3 4
  
  for(int integer : integerList) {
    System.out.println(integer);
  }
  // Output: 1 2 3 4 
  
  Iterator <Integer> listIterator = integerList.iterator();
  
  while(listIterator.hasNext()) {
    System.out.println(listIterator.next());
  }
  // Output: 1 2 3 4
```


<a name="VectorIterating" ></a>
```java 
  Vector <Integer> integerList = new Vector<>();
  integerList.add(1);
  integerList.add(2);
  integerList.add(3);
  integerList.add(4);
  
  for(int i = 0; i < integerList.size(); i++) {
    System.out.println(integerList[i]);
  }
  // Output: 1 2 3 4
  
  for(int integer : integerList) {
    System.out.println(integer);
  }
  // Output: 1 2 3 4 
  
  Iterator <Integer> listIterator = integerList.iterator();
  
  while(listIterator.hasNext()) {
    System.out.println(listIterator.next());
  }
  // Output: 1 2 3 4
```

- Iterating Sets

  - <a href='#HashSetIterating'>HashSet</a>
  - <a href='#LinkedHashSetIterating'>LinkedHashSet</a>
  - <a href='#TreeSetIterating'>TreeSet</a>


<a name="HashSetIterating" ></a>
```java 
  HashSet <Integer> integerList = new HashSet<>();
  integerList.add(1);
  integerList.add(2);
  integerList.add(3);
  integerList.add(4);
  
  // Up to Java 8
  for(int integer : integerList) {
    System.out.println(integer);
  }
  // Output: 1 2 3 4 
  
  // Java 8
  integerList.forEach(integer -> { System.out.println(integer) });
  // Output: 1 2 3 4
  
  
  Iterator <Integer> listIterator = integerList.iterator();
  
  while(listIterator.hasNext()) {
    System.out.println(listIterator.next());
  }
  // Output: 1 2 3 4
```


<a name="LinkedHashSetIterating" ></a>
```java 
  HashSet <Integer> integerList = new HashSet<>();
  integerList.add(1);
  integerList.add(2);
  integerList.add(3);
  integerList.add(4);
  
  for(int integer : integerList) {
    System.out.println(integer);
  }
  // Output: 1 2 3 4 
  
  Iterator <Integer> listIterator = integerList.iterator();
  
  while(listIterator.hasNext()) {
    System.out.println(listIterator.next());
  }
  // Output: 1 2 3 4
```


<a name="TreeSetIterating" ></a>
```java 
  HashSet <Integer> integerList = new HashSet<>();
  integerList.add(1);
  integerList.add(2);
  integerList.add(3);
  integerList.add(4);
  
  for(int integer : integerList) {
    System.out.println(integer);
  }
  // Output: 1 2 3 4 
  
  Iterator <Integer> listIterator = integerList.iterator();
  
  while(listIterator.hasNext()) {
    System.out.println(listIterator.next());
  }
  // Output: 1 2 3 4
```

- Iterating Maps

  - <a href='#IteratingKeys'>Iterating for Keys</a>
  - <a href='#IteratingValues'>Iterating for Values</a>
  - <a href='#IteratingKeyValuePairs'>Iterating for Key Value pairs</a>
  


<a name='IteratingKeys'></a>
```java
  HashMap <String, Animal> animalMap = new HashMap<>();
  animalMap.put("cat1", new Animal("Cat"));
  animalMap.put("cat2", new Animal("Cat"));
  animalMap.put("dog1", new Animal("Dog"));
  animalMap.put("rabbit1", new Animal("Rabbit"));
  
  Iterator <String> animalMapIterator = animalMap.keySet().iterator();
  while (animalMapIterator.hasNext()){
      System.out.println(animalMapIterator.next());
  }
  // Output: cat2 cat1 rabbit1 dog1
```

<a name='IteratingValues'></a>
```java
  LinkedHashMap <String, Animal> animalMap = new LinkedHashMap<>();
  animalMap.put("cat1", new Animal("Cat"));
  animalMap.put("cat2", new Animal("Cat"));
  animalMap.put("dog1", new Animal("Dog"));
  animalMap.put("rabbit1", new Animal("Rabbit"));
  
  Iterator <Animal> animalMapIterator = animalMap.values().iterator();
  while (animalMapIterator.hasNext()){
      System.out.println(animalMapIterator.next());
  }
  // Output: Cat Cat Rabbit Dog
```

<a name='IteratingKeyValuePairs'></a>
```java
  HashMap <String, Animal> animalMap = new HashMap<>();
  animalMap.put("cat1", new Animal("Cat"));
  animalMap.put("cat2", new Animal("Cat"));
  animalMap.put("dog1", new Animal("Dog"));
  animalMap.put("rabbit1", new Animal("Rabbit"));
  
  Iterator <Map.Entry<String, Animal>> animalMapIterator = animalMap.entrySet().iterator();
  while (animalMapIterator.hasNext()){
      Map.Entry<String, Animal> animalInfo = animalMapIterator.next();
      System.out.println(animalInfo.getKey() + " (" + animalInfo.getValue() + ")");
  }
  // Output: cat2 (Cat) cat1 (Cat) rabbit1 (Rabbit) dog1 (Dog)

  // Java 8
  animalMap.forEach((key, value) -> { System.out.println(key + " is " + value); });
```