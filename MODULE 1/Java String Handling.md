# String Handling

## **String**

- An immutable class (once a string has been create, it can't be changed)
  
  ```java 
  
  String s1 = "hello"; // String Literal (actual value) // Recommended approach
  
  String s2 = new String("hello"); // Discouraged approach
  
  // Test 1:
  s1.toUpperCase(); // Returns string object that is the modified version. Here is it not stored anywhere so is discarded.
  System.out.println(s1); // Output: hello
  
  
  // Test 2:
  
  s1 = s1.toUpperCase(); // s1 disconnectes from 'hello' and connects to 'HELLO' (Create new object for s1 to refer to)
  System.out.println(s1); // Output: HELLO
  
  
  // Test 3:
  
  System.out.println(s1 == s2); // Output: false
  
  /* 
    == compares whether s1 and s2 are referring same object or not
  */
  
  
  // Test 4: 
  
  String s3 = "hello";
  
  System.out.println(s1 == s3); // Output: true
  
  /*
    as we don't explicitly ask to create a new object. Java first checks to see if a String object exists with same value.
  */

  
  ```
  
  ------------------------------------------------------------------------------------------
  
## **StringBuffer**
  
  - A mutable class object
  - SYNCHRONIZED (Thread-Safe) - expensive
  - Avoid unless completely necessary
  
  ```java 
  
    StringBuffer sb1 = "hello"; // Compile-time Error: String Literals cannot be stored in StringBuffer
    
    StringBuffer sb2 = new StringBuffer("hello");
    
    sb2.append("java"); // Concatenation
    
    System.out.println(sb2); // Output: hellojava -> Must put spaces in manually
  
  ```
  
  ------------------------------------------------------------------------------------------
  
## **String Builder**
  Since Java 7
  
  - A mutable class object
  - NOT synchronized - inexpensive
  - Recommended Class! (Over StringBuffer)
  
  - See StringBuffer for examples