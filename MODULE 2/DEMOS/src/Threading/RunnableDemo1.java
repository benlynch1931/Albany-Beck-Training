package Threading;

class ThreadTarget1 implements Runnable {

    @Override
    public void run() {

        System.out.printf("%S, Target is running", Thread.currentThread().getName());
    }
}


public class RunnableDemo1 {

    public static void main(String[] args) {

        ThreadTarget1 tar1 = new ThreadTarget1();

        Thread t1 = new Thread(tar1);
        Thread t2 = new Thread(tar1);

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.start();
        t2.start();

    }
}
