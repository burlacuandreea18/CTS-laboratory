package cts.burlacu.andreea.g1092.pattern.adapter;

public abstract class BankAccount {
    double balance;
    String id;

    public BankAccount(double Balance, String Id) {
        balance = Balance;
        id = Id;
    }
}