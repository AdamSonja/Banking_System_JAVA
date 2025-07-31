package com.bms.bankmanagementsystem.model.Account;

import com.bms.bankmanagementsystem.Enum.AccountEnum.AccountType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AccountIdentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "account_id", nullable = false)  // <- owns the FK
    private Account account;
    //BANK KI PEHECHAN
    @Enumerated(EnumType.STRING)
    private AccountType type;
    private String iban;// for cross-border transfers
    private String SWIFT; //→ required for international transactions
    private String ifscCode;
    private String branch;
    private String micrCode;//→ used in India for cheques



}
