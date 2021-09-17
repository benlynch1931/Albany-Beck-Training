# Arrays

List or collection of ***Similar*** data elements

Arrays are objects in Java


### Syntax

  datatype[] arrayName = new datatype[size];
  datatype[] arrayName = { [arrayValues] }; // Provided you have the values ready to go into the array

  e.g.
  ```
  int[] a = new int[4];
  a[0] = 10;
  a[1] = 20;
  a[4] = 100; ArrayIndexOutOfBoundsException
  ```

  System.out.println(a[0]); // 10
  System.out.println(a[3]); // 0

  int -> 0
  float -> 0.0
  double -> 0.0
  char -> " "
  boolean -> false

  |datatype|default_value|
  |--------|-------------|
  |int     |0            |
  |float   |0.0          |
  |double  |0.0          |
  |char    |" "          |
  |boolean |false        |
  |String  |null         |
