package EXERCISES.Collections;

import EXERCISES.Collections.Animal;

public class Rabbit extends Animal {
  public Rabbit(String name, int age) {
    super(name, age);
  }

  @Override
  public String sayHello() {
    return "...(I'm a rabbit so I don't say anything)";
  }
  @Override
  public String move() {
    return "Boing boing boinggggg";
  }

  @Override
  public String getClassName() {
    return "Rabbit";
  }
}
