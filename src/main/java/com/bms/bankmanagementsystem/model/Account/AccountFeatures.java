package com.bms.bankmanagementsystem.model.Account;

import com.bms.bankmanagementsystem.Enum.AccountEnum.DepositMoney;
import com.bms.bankmanagementsystem.Enum.AccountEnum.WithDrawMoney;
import com.bms.bankmanagementsystem.model.User.UsersProfile;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data@Setter@Getter@Entity
public class AccountFeatures {
    @ManyToOne @JoinColumn(name = "user_id",nullable = false)
    private UsersProfile user;

    @OneToOne
    @JoinColumn(name = "account_id",nullable = false)
    private Account account;
    //Features aur Limitations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double MinimumBalance;
    private Double TransactionFee;
    private Double TransactionLimit;
    private Boolean OverdraftEnabled;
    private Double CreditLimit;

    @Enumerated(EnumType.STRING)
    private DepositMoney depositmoney;
    @Enumerated(EnumType.STRING)
    private WithDrawMoney withdrawmoney;
    private String Fund_Transfers;
    private String TransactionRecords;
    private Double InterestHandling;
    private Double BillPaymentsAutodebits;

}
