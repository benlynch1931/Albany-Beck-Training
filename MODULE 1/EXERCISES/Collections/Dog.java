package EXERCISES.Collections;

import EXERCISES.Collections.Animal;

public class Dog extends Animal {
  public Dog(String name, int age) {
    super(name, age);
  }

  @Override
  public String sayHello() {
    return "Woof!";
  }
  @Override
  public String move() {
    return "*Try and run on the lead and pull my owner over*";
  }

  @Override
  public String getClassName() {
    return "Dog";
  }
}
