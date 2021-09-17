# Control Statements/If statements

1. Conditional statements/If statements

  - Curly braces are not required. However, it only accepts the line immediately below the if statement.
  - To have multiple statements in a conditional, you ***MUST*** use curly braces

  ```
  if (condition) {

  }
  else if (condition) {

  }
  else {

  }
  ```

  NESTED IF STATEMENT
  ```
  if (condition) {
    if (condition) {

    }
  }
  ```


2. Iteration statements/Loop constructs

  1. while

    ```
    while (condition) {

    }
    ```

  2. for

  ```
  for (initialization; condition; incrementation) {

  }
  ```

  3. do-while
  - executes the block AT LEAST once

  ```
  do {

  }
  while (condition);
  ```

  4. Enhanced for loop (ForEach) [LIMITED to arrays **ONLY**]
  Automatically increments and stops

  ```
  for(datatype var : arrayName) {

  }
  ```

3. Termination statements/Jump statements

Jumping Statements are the control statements which transfer execution control of the program to another part of the program.

Java has three types of jumping statements:
  1. `break`
  2. `continue`
  3. `return`

Termination/Break statements terminate the execution of a specific part of the program.
