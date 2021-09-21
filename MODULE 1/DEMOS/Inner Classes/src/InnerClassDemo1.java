class Outer1 {

    private int x = 100;
    private int y = 200;

    // Must be public to be access outside the 'Outer' class
    public class NonStaticInner {

        // Must be public to be access outside the 'Outer' class
        public void display(){
            System.out.println(x + y);
        }
    }

}


public class InnerClassDemo1 {

    public static void main(String[] args) {
        Outer1 outer = new Outer1();

        // Must have the outer class as a caller as class is specific to the outer class objects
        // If you are going to do this, the inner class might as well be its own class outside of Outer.
        Outer1.NonStaticInner inner = outer.new NonStaticInner();

        inner.display();
    }
}
