package BankingSystem;

public class CurrentAccount extends BankAccount{
    private double OverdraftLimit;
    public CurrentAccount(String AccountNumber, double balance , double OverdraftLimit){
        super(AccountNumber, balance,"Current Account");
        this.OverdraftLimit=OverdraftLimit;
    }
    @Override
    public void deposit(double amount) {
    if (amount>0){
        balance+=amount;
        System.out.println("rupee"+amount+"deposited to Current Account");
    }else{
        System.out.println("The Entered amount must be Postitve");
    }
    }

    @Override
    public void withdraw(double amount) {
    if (amount>0&&amount<balance){
        balance-=amount;
        System.out.println("rupee "+amount+" debited from your account ");
    }else {
        System.out.println("Please but some balance in Your Account or Withdrawl Limit exceeded or Invalid Account");
    }
    }
    @Override
    public  void displayAccountInfo(){
        super.displayAccountInfo();
        System.out.println("OverdraftLimit"+OverdraftLimit);
    }

}
