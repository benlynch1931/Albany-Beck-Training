class Outer3 {

    private int x = 100;
    private int y = 200;

    public void localInnerClass() {

        // Cannot be declared as `public` or `static` as it's local to an instance method
        // Cannot be access from outside the localInnerClass() method
        class LocalInner {

            public void display(){

                System.out.println(x + y);
            }
        }

        LocalInner inner = new LocalInner();
        inner.display();

    }

}


public class InnerClassDemo3 {

    public static void main(String[] args) {
        // Saves us having to use `Outer.StaticInner` each time
        Outer3 outer = new Outer3();
        outer.localInnerClass();

    }
}
