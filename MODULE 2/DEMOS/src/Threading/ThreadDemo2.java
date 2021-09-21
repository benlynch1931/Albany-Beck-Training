package Threading;

class NewThread2 extends Thread {

    @Override
    public void run() { // `Running State`

        try {
            Thread.sleep(5000); // Guaranteed to run // This will send the thread to `sleeping/waiting state`
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("New Thread is running");

    } // `Dead State`
}


public class ThreadDemo2 {

    public static void main(String[] args) {

        NewThread2 n2 = new NewThread2(); // `New State`

        n2.start(); // Thread will more from `New State` to `Runnable` or `Ready` state

    }

}
