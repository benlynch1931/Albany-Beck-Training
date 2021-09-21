package Threading;

class BankAccount implements Runnable {

    private int balance = 1000;

    private int withdraw;

    public BankAccount(int withdraw) {
        this.withdraw = withdraw;
    }


    @Override
    public void run() {

        if (balance >= withdraw) {
            System.out.printf("%s has withdraw £%s\n", Thread.currentThread().getName(), withdraw);
            balance -= withdraw;
        } else {
            System.out.println("Insufficient funds...");
        }

    }
}


public class RunnableDemo2 {

    public static void main(String[] args) {

        BankAccount tar1 = new BankAccount(1000);

        Thread t1 = new Thread(tar1);
        Thread t2 = new Thread(tar1);

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.start();
        t2.start();

    }
}
