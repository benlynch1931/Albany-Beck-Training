package EXERCISES.Collections;

import java.util.*;

abstract class Animal implements Comparable<Animal> {

  private String name;
  private int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
  	return this.age;
  }

  public String getName() {
  	return this.name;
  }

  public void setAge(int age) {
  	this.age = age;
  }

  public void setName(String name) {
  	this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Name: %s, Age: %s", this.name, this.age);
  }

  @Override
  public int compareTo(Animal a) {
    return this.age - a.getAge();
  }

  public abstract String sayHello();
  public abstract String move();
  public abstract String getClassName();
}
