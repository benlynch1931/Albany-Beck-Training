class Car {
  private String make;
  private String model;
  private int doorCount;
  private String gearboxType;
  private int gear;


  public Car (String make, String model, int doorCount, String gearboxType) {
    this.make = make;
    this.model = model;
    this.doorCount = doorCount;
    this.gearboxType = gearboxType;
    this.gear = 0;
  }

  public String getMake () {
    return this.make;
  }

  public String getModel () {
    return this.model;
  }

  public String getGear () {
    if (this.gear == 0) {
      return "Neutral";
    }
    return Integer.toString(this.gear);
  }

  public void changeUpGear () {
    if (this.gear >= 6) {
      return;
    }
    this.gear += 1;
  }

  public void changeDownGear () {
    if (this.gear <= 0) {
      return;
    }
    this.gear -= 1;
  }

  public void displayCarInfo () {
    System.out.println("This car is a " + this.make + " " + this.model + ". It is a " + this.doorCount + " door car and is " + this.gearboxType + ".");
  }
}

class Main {

  public static void main(String[] args) {
    Car audi = new Car("Audi", "S5", 5, "automatic");
    Car angelina = new Car("SEAT", "Leon", 5, "manual");

    audi.displayCarInfo();
    angelina.displayCarInfo();
  }
}
