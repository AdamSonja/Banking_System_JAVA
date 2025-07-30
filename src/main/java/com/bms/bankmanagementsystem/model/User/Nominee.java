package com.bms.bankmanagementsystem.model.User;

import com.bms.bankmanagementsystem.Enum.UserEnum.IdentificationType;
import com.bms.bankmanagementsystem.Enum.UserEnum.NomineeRelation;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Nominee {

    @Id
    private  Long id;
    private String nomineeName;
    private String nomineeRelationship;
    private String nomineeAmount;


    @ManyToOne @JoinColumn(name = "user_id",nullable = false,unique = true)
    private UsersProfile user;
    private  String fullname;
    private NomineeRelation nomineerelation;
    private LocalDate DateOfBirth;
    private String Gender;
    private String Address;
    private String PhoneNumber;
    private String Email;
    private String Photo;
    private boolean SharePercentage;
    private String GuardianName;
    private boolean Minor;
    private String GuardianRelation;
    private String GuardianPhone;

    @Enumerated(EnumType.STRING)
    private IdentificationType idType;
    private String idNumber;
    private Double ShareAmount;
}
