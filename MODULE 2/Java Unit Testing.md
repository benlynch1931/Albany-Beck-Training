# Testing

## What is the main object of testing?

- A process of finding whether an application produces excepted output or not
- A process of finding bugs


Types of Testing?
- Manual

  We write some System output statements randomly and see if it displays expected output

  **No guarantee that the code it tested correctly or accurately**

  Error Prone

  Time consuming

  Difficult to say that some % of code is tested or exercised

  No suitable for regression testing (re-running functional/non-functional tests to ensure that previous testes softwware develops after a change)


- Automated

  Speed/Fast

  Guarantee the % of code is being tested

  Suitable for regression testing




## Unit Testing

Testing a block of code which could be a method or object or SQL query or a class

It is an automated testing which focuses on testing a specific feature/behaviour or an application

Unit testing is one of the examples of white-box testing


FIRST
  - F - Fast

  - I - Independent

  - R - Repeatable (tested at Dev, QA and Deployment state)

  - S - Self validation (pass/fail)

  - T - Timely
    Traditional: After code -> [Code - Test - Refactor]

    Modern: TDD - Before code (Test first approach) -> [Red - Green - Refactor]



## White-box Testing

An approach where developers deal with the actual code


## Black-box Testing

An approach where testers will not have access to the actual code

Ex: Acceptance Testing


## Unit Testing States

- Passing

- Failing

- Ingoring

- Erroring


## Test-Driven Development

- A practice of writing tests first and code later

- To write some quality code


### TDD Life-Cycle


RED - Write a failing test

GREEN - Write enough code to make the test pass

REFACTOR - To eliminate/avoid code smells. Reduce redundancy/complexity




## Unit Testing Frameworks

Offers an environment where tests can be executed

Ex: jUnit, TestNG



jUnit versions:

jUnit v3 - More boiler plate/legacy code involved

Ex: `public class CustomerTest extends TestCase {
    public void testAddCustomer() {}
    public void testXXXXXXXXX() {}
  }`


jUnit v4 - More annotation-based

  - Not ideal for Java 8+

Ex:  `public class CustomerTest {
    @Test
    public void testAddCustomer() {}

    @Test
    public void testUpdateCustomer() {}
  }`


jUnit v5 (Jupiter) - Not a Unit testing framework but it is an API (Light-weight)

  - Suitable for Java 8+

  Ex:  `public class CustomerTest {
      @Test
      public void addCustomer() {}

      @Test
      public void updateCustomer() {}
    }`
