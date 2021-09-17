## Compiling Java Files

- `$ javac <FILENAME>.java`
  - Compiles and adds class file for each class in file
  - `<CLASSNAME>.class`



# Running Java Compiled Files

- `$ java <CLASSFILENAME>`

# Java Parser

- See what the code is written in the .class file

- `$ javap <CLASSFILENAME>`

To check methods in Math (as an example)

```
  $ javap java.lang.Math
  $ javap java.io.PrintStream

```

# Add-ons

- `-Xlint`


## Bash/Terminal errors

### `'javac' is not recognised as an internal or external command, operable program or batch file`

- Java not installed
- Environment Variables not set
- Path settings not set correctly

### `attempting to assign weaker access privileges; was public`

- Trying to demote a method, check access specifier
