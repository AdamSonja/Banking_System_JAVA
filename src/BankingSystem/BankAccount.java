package BankingSystem;

public abstract class BankAccount {
    protected String AccountNumber;
    protected double balance;
    protected String AccountType;

    public BankAccount(String AccountNumber, double balance, String AccountType) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
        this.AccountType = AccountType;
    }

    //Abstract Method -Subclass must implement this.
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public void displayAccountInfo() {
        System.out.println("Account Number" + AccountNumber);
        System.out.println("Account Type" + AccountType);
        System.out.println("Current Balance" + balance);
    }

}