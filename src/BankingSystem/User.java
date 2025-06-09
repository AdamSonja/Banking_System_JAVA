package  BankingSystem;
import java.util.ArrayList;
import java.util.List;

public class User {
    private static int idcounter =1;

    private int UserId;
    private String name;
    private String email;
    private String password;
    private List<BankAccount> accounts;

    public User(String name,String email, String password){
        this.UserId=idcounter++;
        this.name=name;
        this.email=email;
        this.password=password;
        this.accounts = new ArrayList<>();
    }
    // Method to add new account
    public void addAccount(BankAccount account){
        accounts.add(account);
        System.out.println("Account added for the user "+name);
    }
    // Method to display new account
    public void displayAccount(){
        if(accounts.isEmpty()){
            System.out.println("No Such account found for the User "+name);
            return;
        }
        for (BankAccount account:accounts){
            account.displayAccountInfo();
        }
    }
    public int getUserId(){ return UserId;};

    public String getName(){return name;};
    public String getEmail(){ return email;};
    public List<BankAccount> getAccounts(){return accounts;};

    public boolean verifyPassword(){
        return this.password.equals(inputPassword);
    }

}
