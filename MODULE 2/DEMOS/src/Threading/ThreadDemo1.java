package Threading;

class NewThread1 extends Thread {

    @Override
    public void run() { // `Running State`

        System.out.println("New Thread is running");

    } // `Dead State`
}


public class ThreadDemo1 {

    public static void main(String[] args) {

        NewThread1 n1 = new NewThread1(); // `New State`

        n1.start(); // Thread will more from `New State` to `Runnable` or `Ready` state

    }

}
