class Outer2 {

    private int x = 100;
    private int y = 200;

    // Must be public to be access outside the 'Outer' class
    public static class StaticInner {

        // Must be public to be access outside the 'Outer' class
        public void display(){
            // To access non-static members, create Outer object...
            Outer2 outer = new Outer2();
            System.out.println(outer.x + outer.y);
        }
    }

}



public class InnerClassDemo2 {

    public static void main(String[] args) {
        // Saves us having to use `Outer.StaticInner` each time
        Outer2.StaticInner inner = new Outer2.StaticInner();
//        saving Outer.StaticInner() class to the name inner

        // I want to write inner.display()
        inner.display();



    }
}
