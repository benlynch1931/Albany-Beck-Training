
<a href='#append'>append</a> - concatenates argument to current object value.

<a href='#charAt'>charAt</a> - Returns character at specified index

<a href="#endsWith">endsWith</a> - Returns boolean if string ends with specified substring

<a href='#indexOf'>indexOf</a> - Returns index of first occurrence of specified character(s), within a string

instanceof - returns Class that object is instance of

<a href='#lastIndexOf'>lastIndexOf</a> - Returns index of last occurrence of specified character(s)

<a href="#replace">replace</a> - Replaces all search characters with new character.

<a href='#reverse'>reverse</a> - Replaces current character sequence with the reverse of it

<a href="#startsWith">startsWith</a> - Returns boolean if string begins with specified substring

<a href="#substring">substring</a> - Returns substring of string between specified start and specified end or string length

<br />

-----------------------------------------------------------

<a name="append">**append(string)**</a>

- *Implemented in StringBuilder*
- Concatenates specified string to end of current object value.
- Does not add space by default, you have to add it yourself.
- Automatically updates value of object

```java
StringBuilder sb1 = new StringBuilder("Hello");
sb1.append("World"); // sb1 is "HelloWorld"
        
StringBuilder sb2 = new StringBuilder("Hello");
sb2.append(" World"); // sb2 is "Hello World"
```
<br />

-----------------------------------------------------------

<a name="charAt">**charAt(idx)**</a>

- *Implemented in String*
- Returns character at specific index
- `IndexOutOfBoundsException` is thrown if index value greater than string length

```java
String s1 = "johnsmith@gmail.com";
s1.charAt(0); // Returns "j"
s1.charAt(9); // Returns "@"
```
<br />
        
-----------------------------------------------------------

<a name='endsWith'>**endsWith(*substring*)**</a>

- *Implemented in String*
- Returns boolean of whether a string ends with a specified substring
```java
String s1 = "This is line";

s1.startsWith("This i"); // Returns false
s1.startsWith("isline:"); // Returns false
s1.startsWith("is line"); // Returns true
```
<br />

-----------------------------------------------------------

<a name="indexOf">**indexOf(char, [startingIndex])**</a>

- *Implemented in String*
- Returns index of first occurrence of character(s) passed as argument
- Works by iterating through String, starting at specified index, or end of string
  - Hence if the character exists more than once, it will display the smallest index value
- If the character does not exist in the string, -1 is returned

```java
String s1 = "johnsmithgmail.com";
s1.indexOf("@"); // Returns -1
s1.indexOf("g"); // Returns 9
s1.indexOf("m"); // Returns 5
s1.indexOf("o"); // Returns 1
```
<br />

-----------------------------------------------------------

<a name="lastIndexOf">**lastIndexOf(char, [startingIndex])**<a/>

- *Implemented in String*
- Returns index of last occurrence of specified character(s)
- Works by iterating *backwards* through String, starting at specified index, or end of string
```java
String s1 = "johnsmithgmail.com";
s1.indexOf("@"); // Returns -1
s1.indexOf("g"); // Returns 9
s1.indexOf("m"); // Returns 17
s1.indexOf("o"); // Returns 16
s1.lastIndexOf("com"); // Returns 15
```
<br />

-----------------------------------------------------------

<a name='replace'>**replace(*searchChar*, *newChar*)**</a>

- *Implemented in String*
- Replaces all search characters with new character
- Have to re-assign as it's a String Object
```java
String s1 = "Hello World!"
s1 = s1.replace("l", "b"); // Replaces all "l" with "b"
System.out.println(s1); // Output: "Hebbo Worbd!"
```
<br />

-----------------------------------------------------------

<a name='reverse'>**reverse()**</a>

- *Implemented in StringBuilder*
- Replaces character sequence with complete reverse of it
```java
StringBuilder sb = new StringBuilder("Hello World!");
StringBuilder sb2 = new StringBuilder("Hello World2!");
sb.reverse(); // replaces sb with "!dlroW olleH"
System.out.println(sb); // Output: "!dlroW olleH"

System.out.println(sb2.reverse()); // Output: "!2dlroW olleH"
```
<br />

-----------------------------------------------------------

<a name='startsWith'>**startsWith(*substring*)**</a>

- *Implemented in String*
- Returns boolean of whether a string begins with a specified substring
```java
String s1 = "This is line";

s1.startsWith("This i"); // Returns true
s1.startsWith("thisis"); // Returns false
s1.startsWith("is line"); // Returns false
```
<br />

-----------------------------------------------------------

<a name='substring'>**substring(*startIndex, [endIndex]*)**</a>

- *Implemented in String*
- returns substring of string between specified start/end points.
- NOTE: End point is exclusive!
```java
String s1 = "hello java";

System.out.println(s1.substring(1));  // Output: ello java
System.out.println(s1.substring(1, 1)); // no output
```