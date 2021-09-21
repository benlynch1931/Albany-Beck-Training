interface Calculator {

    // For Lambda expressions, it would be better to rename the method
    // to `calc` so the lambda expression can implement polymorphism and
    // choose the logic of the function
    int add(int a, int b);
//    public int subtract(int a, int b);

}

class CalculatorService implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }
}

class ScientificCalculatorService implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class AnonymousInner {

    public static void main(String[] args) {
        // Industry standard as it embraces polymorphism
        Calculator c1 = new CalculatorService();

        System.out.println(c1.add(100, 200)); // Output: 300

        c1 = new ScientificCalculatorService();

        System.out.println(c1.add(1000, 2000)); // Output: 3000

        // This code is very noisy, Java8 implements a new feature...

//        Calculator c2 = new Calculator() {
//            // Anonymous Inner Class starts here...
//            @Override
//            public int add(int a, int b) {
//                return 0;
//            }
//        }; // Anonymous Inner Class ends here...


        // Java8 Lambda Expression acts as an alternative to Anonymous Inner Class
        Calculator c2 = (int a, int b) -> { return a+b; }; // Version 1
        Calculator c3 = (a, b) -> { return a+b; }; // Version 2
        Calculator c4 = (a, b) -> a + b; // Version 3

        System.out.println(c2.add(1, 2));

        process(c3);
    }

    public static void process(Calculator c) {

    }

}


