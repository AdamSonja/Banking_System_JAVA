package com.bms.bankmanagementsystem.model.Account;

import com.bms.bankmanagementsystem.model.User.UsersProfile;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data@Setter@Getter@Entity
public class AccountFeatures_Limitation {
    //Features aur Limitations
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private UsersProfile user;
    private Double MinimumBalance;
    private Double TransactionFee;
    private  Double TransactionLimit;
    private Boolean OverdraftEnabled;
    private Double CreditLimit;



}
