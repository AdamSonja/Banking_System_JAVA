package BankingSystem;

public class SavingAccount extends BankAccount {

    public SavingAccount(String AccountNumber, double balance, String AccountType) {
        super(AccountNumber, balance, AccountType);
    }

    private double interestRate;

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("rupee " + amount + "Deposited in savings Account ");
        } else {
            System.out.println("Deposit amount should be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount < balance) {
            balance -= amount;
            System.out.println("rupee " + amount + "Has been debited from your account");
        } else {
            System.out.println("There is no Balanace in the account ");
        }
    }

    public void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest of " + interest + " %" + " Added to your bank account");
    }

    @Override
        public void displayAccountInfo () {
            super.displayAccountInfo();
            System.out.println("Interest Rate :" + interestRate + "%");
    }
}