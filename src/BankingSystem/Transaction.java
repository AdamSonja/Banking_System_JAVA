package BankingSystem;

import java.time.LocalDateTime;

public class Transaction {
    private static int idcounter=1;
    private  int transactionId;
    private String type;
    private double amount;
    private LocalDateTime date;

    public Transaction(String type, double amount){
    this.transactionId=idcounter;
    this.type=type;
    this.amount=amount;
    this.date=LocalDateTime.now();
    }
    public void displayTransaction(){
        System.out.println("TransactionId"+transactionId+"Type"+type+"Amount"+amount+"Transaion Date"+date);
    }
}
