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

  By default, MySQL uses a BTREE index to associate to PK

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

## Ordering

By default, SQL will order by Primary Key, and in ASC order.


## Subqueries

What is a subquery/nested query?

- A query enclosed in another query

Write a query to display employee details whose salary is highest

`SELECT * FROM employee WHERE SALARY = (SELECT max(SALARY FROM employee));`

## Joins

- Joins are used to extract data from multiple tables when possible
  (When there are matching values in join tables)


- Types of join

1. Inner Join (FAQs)
2. Outer Join
3. Left Join (FAQs)
4. Right Join (FAQs)
5. Full Join (Syntax differs between db)
6. Cartesian Join (akin. Mesh Network Topology)

```
  SELECT employee.employee_id, employee.ename, employee.salary, department.dept_id, department.d_name
  FROM department INNER JOIN employee
  ON department.dept_id = employee.department.id
```

Using ALIAS

```
SELECT e.employee_id, e.ename, e.salary, d.dept_id, d.d_name
FROM department d INNER JOIN employee e
ON d.dept_id = e.dep_id
```

CARTESIAN JOIN
```
SELECT * FROm department, employee;
```


## Aggregate Functions

Functions that always return a single value result

List of aggregate functions:

1. sum
2. max (returns max value of column in table)
3. min (returns min value of column in table)
4. avg
5. count (returns no. records available in table)


What is a group by clause?

- Relies on aggregate function to group the matching records

Write a query to display number of employees working in each department?
`SELECT dept_id, count(*) as NumberOfEmployee from employee GROUP BY dept_id`

```
// OUTPUT:
  1 2
  2 1
```

Write a query to display number of employees working in each department where count is more than two?
`SELECT dept_id, count(*) as NumberOfEmployee from employee GROUP BY dept_id HAVING count(*) > 2`

```
// OUTPUT:

```


## PL/SQL or T-SQL (Transact SQL) - Microsoft's SQL server

Procedural Language/SQL

This allows us to write programmatic logic (conditionals, variables, loops, functions, procedures, triggers, packages) within SQL


Advantages:

- Reusability (write once, execute many)

- Group SQL commands into a module-like function or procedure

- We can write scripts that execute based on the given condition


// Write a script to create a procedure in MySQL:

```
DELIMITER $$ ;

CREATE or REPLACE PROCEDURE addNumbers(in a int, in b int, out c int)
BEGIN
  SET c = a + b;
END $$
```

// Write a script to create a function in MySQL:

```
DELIMITER $$ ;

CREATE or REPLACE FUNCTION subtractNumbers(a int, b int) returns int
BEGIN
  return a+b;
END $$
```

FUNCTION vs PROCEDURE  

- Functions always have a return type whereas Procedures don't

- Prodecures use `out` parameters to give something back to the caller





## Indexes

An index improves the performance of querying

Types of indexes:

1. Clustered

  An index which is associated with *more than one* column


2. Non-Clustered

  An index which is associated with *only one* column



## Batch Processing in SQL

A process of executing a group of queries as a batch file


```java
Statement st = con.createStatement();

st.addBatch("<SQL QUERY>");
st.addBatch("<SQL QUERY>");
st.addBatch("<SQL QUERY>");

st.executeBatch();

```




------------------------------------------------------------------------------------------------





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


### Types of Statements in JDBC API

1. Statement

  Offers less performance than PreparedStatement because it does not re-use the query


2. PreparedStatement

  Pre-compiles statements which re-uses the query to improve the performance


3. CallableStatement
