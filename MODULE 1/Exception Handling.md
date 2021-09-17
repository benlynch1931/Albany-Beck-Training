# Exception Handling 

What is an Exception?

- Run-time error (thrown by JRE)

  ```java
  
    int a = 10;
    
    int b = 0;
    
    try {
      System.out.println(a/b); // Execution would be terminated here -> Exception thrown
    }
    catch(ArithmeticException ae) {
      System.out.println("Exception is caught. Please try again!");
    }
    
    System.out.println("hello"); // Wouldn't be run
  
  ```
  

What are clauses of exception handling?

- try

  - program statements that may to throw exepctions should be written in the `try` block
  - Can have *one OR more* `catch` blocks.
  - A try block can be nested
  
  - A try block *MUST* have at least one `catch` block or a `finally` block

- catch 
  
  - Exception thrown by try block is captured in the `catch` block
  - Here, you can write custom error handling
  
  - Exception hierarchy is same as if/else statements.

- throw

  - To throw exceptions manually we use `throw` clause

- throws

  - This is used to indicate that a method may throw exceptions
  - Lazy way to handle exceptions
    ` public static void process() throws ClassNotFoundException {}`

- finally

  - This block is guaranteed to execute regardless of exception state
  - Used to write closing operations
  
  - This is executed before JRE throws an exception if `catch` block is not there.
  
  
  
## **Class Hierarchy for exception handling**

- Object

  - Throwable
  
    - Error [System-Related]
      - (*Has various subclasses which are unchecked*)
      
      - OutOfMemory
    
    - Exception [User-Related]
    
      - RunTimeException
      
        - ArithmeticException
        - NumberFormatException
        
      - FileNotFoundException
      
      - IOException
      
      - ClassNotFoundException
        

- Direct subclasses of RunTimeException class are called "Unchecked Exceptions" (unchecked by compiler)
  - Don't need to be handled by try-catch block.
  
- Direct subclasses of Exception class excl. RunTimeException class are called "Checked Exceptions"
  - MUST be handled by try-catch block OR declared to be thrown
  
  
  
  
## **Custom Exceptions**

- Means 'user-defined' exceptions


1. Create a class by extending `Exception` class (recommended class to extend)

2. Write a parameterzed constructor

3. Override toString() method