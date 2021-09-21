package BankTechTest;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BankAccount {

    private static BankAccount bankAccount;
    private double balance;
    private ArrayList<String[]> activity = new ArrayList<>();

    private BankAccount(double balance) {
        this.balance = balance;
    }

    public static BankAccount getInstance(double balance) {
        if (bankAccount == null) {
            bankAccount = new BankAccount(balance);
        }
        return bankAccount;
    }

    public String[] deposit(double deposit, String date) {
        this.balance += deposit;
        this.activity.add(new String[]{date, null, Double.toString(deposit), Double.toString(this.balance)});
        return this.activity.get(this.activity.size() - 1);
    }

    public String[] withdraw(double deposit, String date) {
        this.balance -= deposit;
        this.activity.add(new String[]{date, Double.toString(deposit), null, Double.toString(this.balance)});
        return this.activity.get(this.activity.size() - 1);
    }

}
