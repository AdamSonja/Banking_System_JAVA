package com.bms.bankmanagementsystem.model.Account;
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

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private UsersProfile user;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private AccountIdentity identity;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private AccountFeatures features;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accountNumber;

    //For Balance Related Query
    private Double balance;
    private String currency;


    //Compliance
    private boolean kycVerified;
    private String riskCategory;
    private String freezeReason;

    //LifeCycle
    private LocalDateTime openedOn;


}
