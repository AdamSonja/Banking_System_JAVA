package com.bms.bankmanagementsystem.model.Account;
import com.bms.bankmanagementsystem.Enum.AccountEnum.AccountType;
import com.bms.bankmanagementsystem.model.User.UsersProfile;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNumber;

    @ManyToOne @JoinColumn(name = "user_id",nullable = false)
    private UsersProfile user;

    //For Balance Related Query
    private Double balance;
    private String currency;

    //BANK KI PEHECHAN
    private AccountType type;
    private String iban;// for cross-border transfers
    private String SWIFT; //→ required for international transactions
    private String ifscCode;
    private String branch;
    private String micrCode;
    private String upiId;

    private String MICRCode; //→ used in India for cheques

    //Compliance
    private boolean kycVerified;
    private String riskCategory;
    private String freezeReason;



    //LifeCycle
    private LocalDateTime openedOn;


}
