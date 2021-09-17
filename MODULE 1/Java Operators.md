## Operators:

1. Arithmetic
  - +, -, *, / and %

2. Assignment
  - =, +=, -=, *=

3. Relational
  - <, >, <=, >=, != and ==

  Java doesn't support it, but `===` compares the value AND datatype.
  `==` can only work on same datatypes, otherwise it will throw an error

4. Boolean Logical
- & AND
- && Short-Circuit AND, but prevents evaluation of following expressions if previous expression evaluates false
- | OR
- || Short-Circuit OR, but prevents evaluation of following expressions if previous expression evaluates true
- ! NOT

Short-Ciruit logic isn't always useful as it can prevent exceptions...
```
a = 10;
b = 0;
(a==b && a/b)
```
Final statement wouldn't find exception for `a/b`

5. Unary Operator
  - ++, --

  `int a = 10;`
  `int b = a++;` // POSTFIX
  `int b = ++a;` // PREFIX -> Increments `a` before assigning to `b`

  `System.out.println(a)` // Output: 11
  `System.out.println(b)` // Output: 10

  because `a++ == a+=1` so `a` changes and `a` is stored into `b` before it is incremented
  `b = a++ == b=a; a++`

  `int x = 100;`
  `System.out.println(x++);` // Output: 101

  because println takes the result of x++, it is NOT assigning




6. Bitwise Operators - Low level operators normally used in Encryption & Decryption

- &
- |
- ^
- >>
- <<
- >>>

int x = 10;
int y = 20;

int c = x & y;
1. x = 01010; y = 10100;
2. Compare via AND: 01010
                    10100
                    -----
                    00000
3. convert back.
