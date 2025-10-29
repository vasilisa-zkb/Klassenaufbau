package exercise4;

public class BankAccount {


    private String surName;
    private String name;
    private int accountNumberID;
    double balance;
    private int limit;

    public BankAccount(String name, String surName, int accountNumberID, double balance, int limit) {
        this.name = name;
        this.surName = surName;
        this.accountNumberID = accountNumberID;
        this.balance = balance;
        this.limit = limit;
    }

    public void withdraw(int withdrawAmount) {

        if (this.limit >= withdrawAmount && withdrawAmount <= balance) {

            balance = balance - withdrawAmount;

        } else {
            balance = balance - 0;
            System.out.println("Limit reached" + "\n" + "unable to withdraw anything" + "\n" + "please try again");
        }
        System.out.println("balance " + balance);

    }

    public int deposit(int deposit) {
        balance += deposit;
        System.out.println("balance now " + balance);
        System.out.println('\n');
        return deposit;
    }

    public String printbalance() {
        System.out.println("current balance is " + balance);
        System.out.println('\n');
    return "current balance is " + balance;
    }

    @Override
    public String toString() {
        return "Name " + name + " Surname " + surName + " account ID " + accountNumberID + " balance " + balance + " Limit " + limit + "\n";

    }
}


    /* public void drive(int i) {
    } */
