# Design Patterns

What are design patterns?

- To produce re-usable solution

- To organize the code in an efficient way

Design Patterns:

1. Singleton

  One object per application

  i.e. Database connection, configuration

  -> Steps to create a Singleton Class
    1) Declare a static reference field

    2) Write a private constructor

    3) Write a static method to call private constructor and return singleton object


2. Factory

  A way to produce and supply objects

  We can group object creation steps in a separate location called `factory`

  Methods of Factory class are static

  A factory method is a method which returns an object of its own class


3. MVC - Defacto(Default) -> [Model, View, Controller]

  Model - Represents state of an application/component

    -> Simple Java classes that contain fields, constructors, getters and setters
    -> This class could be referred to as ***POJO (Plain-Old-Java-Object) class***
    -> Also Known as Domain/Component/Entity class

    -> May contain code that connects database and performs transactions


  View - Represents presentation logic or UI logic

  Controller - Acts like a command interpreter/request processor


4. Observable

5. Builder

6. DAO -> [Data Access Object]

7. DTO -> [Data Transfer Object]
