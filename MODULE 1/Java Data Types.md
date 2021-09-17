# Java Datatypes


## Strongly Typed

- Data Types are compulsory
- C, C++, C# and Java

## Weakly Typed

- Data Types are not compulsory
- Python, JavaScript, PHP


List of Datatypes

1. Primitive [8 types]

  a) Boolean

    boolean - 1 byte OR System Dependent


  b) Integer

  We must be sensible developers and use correct types.
  Write validations to ensure correct values.

  |Name|Size in Bytes|
  |----|-------------|
  |Byte|1 = 8 bits (2^8 = 256) => -128 to +127|
  |short|2 = 16 bits (2^16 = 65536) => -32768 to +32767|
  |int|4|
  |long|8|

  `byte a = 100;` // VALID
  `byte b = 128;` // ERROR
  `byte c = (byte) 128;` // VALID, because of explicit type casting
  `System.out.printLn(c);` => `-128`

  `byte d = (byte) 129;` // VALID, because of explicit type casting
  `System.out.printLn(d);` => `-127`


  c) Floating Point

  both used for storing fractional values.
  ***All fractional values in Java are considered doubles by default***

  float - 4 bytes

  double - 8 bytes **[PREFERRED/REECOMMENDED]**
  - Compatible with databases

  `float x = 10.5;` // INVALID
  `float x = (float) 10.5;` // VALID

  `float x = 10.5f;` // VALID

  `double z = 10.5;` // VALID


  d) Character

  Stores a single character

  char - 2 bytes


2. Class/Reference types

  a) String

  b) Array
