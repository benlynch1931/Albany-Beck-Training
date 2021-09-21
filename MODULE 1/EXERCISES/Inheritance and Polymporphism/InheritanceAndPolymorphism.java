class Point {
  private double x;
  private double y;

  public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }

  public void setX(double x) {
  	this.x = x;
  }

  public void setY(double y) {
  	this.y = y;
  }

  public double getX() {
  	return this.x;
  }

  public double getY() {
  	return this.y;
  }

  @Override
  public String toString() {
    return String.format(" With a center point (%s, %s),", this.x, this.y);
  }
}






abstract class Shape {

  private String name;
  private String colour;

  public Shape(String name, String colour) {
    this.name = name;
    this.colour = colour;
  }

  public String getName() {
  	return name;
  }

  public String getColour() {
  	return colour;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  @Override
  public String toString() {
    return String.format("This %s has a colour of %s.", this.name, this.colour);
  }


  public abstract double getArea();

  public abstract Point getCenterPoint();


}









class Rectangle extends Shape {
  private double height;
  private double width;

  public Rectangle (String name, String colour, double width, double height) {
    super(name, colour);
    this.width = width;
    this.height = height;
  }

  @Override
  public Point getCenterPoint() {
    double x = this.width / 2;
    double y = this.width / 2;
    return new Point(x, y);
  }

  @Override
  public double getArea() {
    return (this.width * this.height);
  }

  @Override
  public String toString() {
    // return super.toString() + String.format("It has the dimensions width=%s x height=%s. It also has the center point cp=%s. Is it a square? isSquare=%s", this.width, this.height, getCenterPoint(this.x, this.y), isSquare());
    return super.toString() + getCenterPoint() + String.format(" it has the dimensions %s x %s and an area of %s. Is it a square? %s", this.width, this.height, getArea(), isSquare());
  }

  public boolean isSquare() {
    return (this.width == this.height);
  }
}





class Circle extends Shape {

  private double radius;

  public Circle (String name, String colour, double radius) {
    super(name, colour);
    this.radius = radius;
  }

  @Override
  public Point getCenterPoint() {
    return new Point(this.radius, this.radius);
  }

  @Override
  public double getArea() {
    return (Math.PI * Math.pow(this.radius, 2));
  }

  @Override
  public String toString() {
    return super.toString() + getCenterPoint() + String.format(" it has a radius of %s and an area of %s.", this.radius, getArea());
  }

}





class InheritanceAndPolymorphism {

  public static void main(String[] args) {
    Rectangle r1 = new Rectangle("Rectangle", "red", 3, 8);
    System.out.println("Rectangle, red, 3, 8 -> " + r1);

    System.out.println("--------------------------");

    Circle c1 = new Circle("Circle", "blue", 3.14258);
    System.out.println("Circle, blue, 3.14258 -> " + c1);
  }
}
