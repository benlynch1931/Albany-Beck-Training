# Java Conventions

## Arguments vs. Parameters

- argument refers to the *actual* value
- parameter refers to the variable the value is store in.

## Naming Conventions

- Java is **Case Sensitive**

- File names should mirror the Class name. Including the UpperCamelCase
  - It is not a requirement, but compiling will override the different filename.
- All class names should be in UpperCamelCase i.e. `class HelloWorld {}`


## Method Conventions

- All methods must be defined as either `public` or `private`
- `main` method always takes in `String[] args` as a parameter

- `static` makes it a class method as opposed to an instance method.

- `default` ensures the method is a default. IF it is a common method across child classes etc.

#### main
- `main` method should always defined as `public static void main(String[] args)`. It is COMPULSORY!
- `void` refers to the return type. `void` return type means it doesn't return anything.
- `static` makes it a class method as opposed to an instance method.
  - You would need to create an instance of the class to then be able to run the method

- Ideally, should only be one `main` method across all classes in file.
  - It may point to the wrong `main` method. There are ways to select it, but takes time.

## Class Conventions

- Java accepts 4 modifiers: public, private, protected and package-private/folder-private
- Package-private means a class is *limited* to the folder it is in


- If you define a class as `public`, the filename ***MUST*** match the public classname
  - The interpreter isn't in a position to pick between the public class

- defining a class as `public` allows non-members to access it

- If no Access Specifier is present, the class will be *Package Private* by default.
 - Limited to the folder it is in.

- You *cannot* define a class as `private` when it is a top-level class (not an inner class)

- When inheriting and implementing, `extends` comes first
