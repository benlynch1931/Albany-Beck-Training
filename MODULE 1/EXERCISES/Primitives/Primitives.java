class Primitives {
  public static void main(String[] args) {
    String name = "Ben";
    int age = 20;

    // System.out.println("Hello! I'm " + name + "!");
    // age = 22;
    // System.out.println("My age is: " + age);
    int m = 1;
    double x = 0.5;
    int c = 15;

    double y = m * x + c;

    System.out.println(m + x + c + y);

    boolean isRaining = false;
    boolean happy = true;

    System.out.println(!isRaining & happy);
    System.out.println(!isRaining & !happy);
    System.out.println(isRaining & happy);
    System.out.println(isRaining & !happy);
    System.out.println("----------------");
    System.out.println(!isRaining | happy);
    System.out.println(!isRaining | !happy);
    System.out.println(isRaining | happy);
    System.out.println(isRaining | !happy);

  }
}
