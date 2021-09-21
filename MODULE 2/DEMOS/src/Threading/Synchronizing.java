package Threading;

class SynchronizedBankAccount implements Runnable {

    private int balance = 1000;

    private int withdraw;

    public SynchronizedBankAccount(int withdraw) {
        this.withdraw = withdraw;
    }


    @Override
    public synchronized void run() { // Allows only 1 thread into this method at a time

        if (balance >= withdraw) {
            System.out.printf("%s has withdraw £%s\n", Thread.currentThread().getName(), withdraw);
            balance -= withdraw;
        } else {
            System.out.println("Insufficient funds...");
        }

    }
}


public class Synchronizing {

    public static void main(String[] args) {

        SynchronizedBankAccount acc1 = new SynchronizedBankAccount(1000);

        Thread t1 = new Thread(acc1);
        Thread t2 = new Thread(acc1);

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.start();
        t2.start();

    }
}
