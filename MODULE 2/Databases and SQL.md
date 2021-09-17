# Databases and SQL

## Database Concepts

### What is a file?

- A collection of logically related records


### What is a record?

- A collection of logically related attributes/columns


### What is a database

- A collection of logically related files


### What is a relational database?

- A database that represents data in **terms of tables**


### What is DBMS (Database Management System)?

- A collection of databases and application programs


## Data Modelling
---

### What is a data model?

- A visual/abstract representation of organised (structured) data


### Types of data models?

1. Conceptual

  - A very high-level model which reveals names of entities (tables) and association between them


2. Logical

  - An intermediate-level model which reveals entities, attributes and associations between entities


3. Physical

  - A low-level model which shows database specific model that reveals entities; attributes and their datatypes, size and constraints; and associations between entities



# What is SQL?

- Is an interface between the user and the database

Types of SQL commands?

  1) DDL (Data Definition Language)

    - Deals with table structure/schema

    - CREATE, ALTER, DROP and TRUNCATE


  2) DML (Data Manipulation Language)

    - Deals with table data

    - INSERT, UPDATE, DELETE and SELECT


  3) DCL (Data Control Language)

    - To manage and secure the data accurately
    - Specially designed for admin users

    - GRANT and REVOKE


  4) TCL (Transaction Control Language)

    - COMMIT and ROLLBACK


## Syntax


### CREATE

  ```
    CREATE <table> <tableName>(

      colName datatype[(size)] [Constraint],
      colName datatype[(size)] [Constraint],
      colName datatype[(size)] [Constraint],
      colName datatype[(size)]

    );


    // Ex:

    CREATE table department(

      dept_id int,
      dept_name varchar(20),
      dept_location varchar()

    );
  ```


### ALTER

```
  ALTER <table> <tableName> ADD colName datatype[(size)];
  ALTER <table> <tableName> MODIFY colname(newSize);
  ALTER <table> <tableName> DROP [column] colName;
```


### DROP

```
  DROP <table> <tableName>
```

### TRUNCATE

```
  TRUNCATE [table] <tableName> [RESTART IDENTITY];
```



### INSERT

```
  INSERT INTO <tablename> VALUES(

    val1,
    val2,
    val3

  );

  INSERT INTO <tableName> VALUES(val1, val2, val3), (val1, val2, val3), (val1, val2, val3);

  INSERT INTO <tableName>(colName1, colName2, colName5) VALUES(val1, val2, val5);
```


### UPDATE

```
  UPDATE <tableName> SET target_column = new_value WHERE col_name = some_value;
```


### DELETE

```
  DELETE from <tableName> WHERE col_name = some_value;
```


# SELECT

```
  SELECT */colName1, colName2 FROM <tableName> WHERE [condition] ORDER BY [ASC/DESC];
```

## SQL Constraints

A constraint is a rule which governs data


**Types of Constraints:**

1. NOT NULL - Restricts null values/must have a value

2. DEFAULT - Allows us to set a default value

3. PRIMARY KEY - 1 PER table
  `CONSTRAINT PK_Department PRIMARY KEY(dept_id)`

4. FOREIGN KEY - Refers to a PK column of another table
  `CONSTRAINT FK_Employee FOREIGN KEY(dept_id) REFERENCES department(dept_id)`

  A foreign key can have null values

5. UNIQUE - Table can have more than 1 unique keys

6. CHECK - validates an input value with a condition

- Table level constraints
`CONSTRAINT <Constraint_Name> <constraintType>`
`CONSTRAINT <PK_Department PRIMARY KEY(dept_id)`
` ON DELETE CASCADE` // If parent record deleted, delete all child records
` ON UPDATE CASCADE` // If parent record updated, update all child records


- Referential Integrity
  - Ensures consistency between parent and child tables
  - Parent records cannot be deleted if the child table refers to those records



```

  CREATE table department(
      dept_id int NOT NULL,
      d_name varchar(20) NOT NULL,
      location varchar DEFAULT "London",

      -- Table level constraints
      CONSTRAINT PK_Department PRIMARY KEY(dept_id)
  )

```



# JDBC API

- Java Database Connectivity

- JDBC API enables Java application to communicate with backend database

- It provides various classes and interfaces


### What is JDBC API Architecture?

Java application -> Application Layer

      |
////////////////////////////////////////////
JDBC API

      |

DriverManager (A class defines in java.sql)

      |

Connection (A Java Interface defined in java.sql)

      |

Statement (A Java Interface defined in java.sql)

      |
     / \

DB  || DB || DB



### What is a CLASSPATH?

- A CLASSPATH is an environment variable which refers to .class files that are compressed in a .jar file
