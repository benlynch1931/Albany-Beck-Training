package EXERCISES.Collections;

import EXERCISES.Collections.Animal;

import java.util.*;

public class Cat extends Animal {
  public Cat(String name, int age) {
    super(name, age);
  }

  @Override
  public String sayHello() {
    return "Meowwwwwwwwwwwwwww";
  }
  @Override
  public String move() {
    return "purrr, move, stop, look, move, purrr, move, stop in the road";
  }

  @Override
  public String getClassName() {
    return "Cat";
  }

}
