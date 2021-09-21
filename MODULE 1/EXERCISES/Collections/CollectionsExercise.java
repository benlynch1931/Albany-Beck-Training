package EXERCISES.Collections;

import java.util.*;

class CollectionsExercise {

  public static void main(String[] args) {
    Cat cat1 = new Cat("Boris", 24);
    Cat cat2 = new Cat("Shirley", 73);
    Dog dog1 = new Dog("William", 22);
    Dog dog2 = new Dog("Ernie", 1);
    Rabbit rabbit1 = new Rabbit("Christopher", 492);

    ArrayList <Animal> animalList = new ArrayList<>();

    animalList.add(cat1);
    animalList.add(cat2);
    animalList.add(dog1);
    animalList.add(dog2);
    animalList.add(rabbit1);

    for (Animal animal : animalList) {
      System.out.println(animal);
    }
    Collections.sort(animalList);
    System.out.println("\nSorted ArrayList by Age: ");
    System.out.println(animalList);







    HashMap <String, Animal> animalHashMapString = new HashMap<>();

    animalHashMapString.put("Cat", cat1);
    animalHashMapString.put("Cat", cat2);
    animalHashMapString.put("Dog", dog1);
    animalHashMapString.put("Dog", dog2);
    animalHashMapString.put("Rabbit", rabbit1);







    HashMap <Animal, String> animalHashMapObj = new HashMap<>();

    animalHashMapObj.put(cat1, "Old B***er");
    animalHashMapObj.put(cat2, "Dainty like Teresa May");
    animalHashMapObj.put(dog1, "My G");
    animalHashMapObj.put(dog2, "Bouncy little whatsit");
    animalHashMapObj.put(rabbit1, "(Get the name?)");

    System.out.println("\n\nIterating HashMap:\n");
    Iterator <Map.Entry<Animal, String>> hashMapIterator = animalHashMapObj.entrySet().iterator();
    while(hashMapIterator.hasNext()) {
      Map.Entry<Animal, String> animal = hashMapIterator.next();
//      System.out.println(hashMapIterator.next().getKey() + " aka. " + hashMapIterator.next().getValue());
      System.out.println(animal.getKey() + " aka " + animal.getValue());
    }









    HashSet<Animal> animalHashSet = new HashSet<>();

    animalHashSet.add(cat1);
    animalHashSet.add(cat2);
    animalHashSet.add(dog1);
    animalHashSet.add(dog2);
    animalHashSet.add(cat1);
    animalHashSet.add(rabbit1);

    System.out.println("\n\nIterating HashSet:\n");
    Iterator <Animal> animalIterator = animalHashSet.iterator();
    while(animalIterator.hasNext()) {
      System.out.println(animalIterator.next());
    }


    System.out.println("\n\nFinding specific object:\n");

    Scanner animalHashSetInput = new Scanner(System.in);
    boolean foundName;
    do {
      foundName = false;
      System.out.println("Enter a name to search: ");
      String inputName = animalHashSetInput.nextLine();
        for (Animal animalObject : animalHashSet) {
          if (animalObject.getName().equals(inputName)) {
            foundName = true;
            System.out.println(inputName + " is a " + animalObject.getClassName() + ". They are " + animalObject.getAge() + " years old.");
          }
        }
        if (!foundName) {
          System.out.println("Unfortunately, that animal name does not exists...");
        }

    }
    while (true);
  }
}
