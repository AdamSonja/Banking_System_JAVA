package com.bms.bankmanagementsystem.model.User;

import com.bms.bankmanagementsystem.Enum.UserEnum.*;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class UsersProfile {
    private String username;
    private String password;
    @Id
    //Personal Info
    private Long id;
    @Lob
    @Column(columnDefinition = "MEDIUMGBLOB") // for large images
    private byte[] signature;
    private String phonenumber;
    private String age;
    private String DOB;
    private BloodGroup BloodGroup;
    private String FathersName;
    private String MotherName;
    private String AlternativePhoneNumber;
    private String email;
    private String SpouseName;
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    @Enumerated(EnumType.STRING)
    private Religion Religion;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String ProfilePictureUrl;
    @Enumerated(EnumType.STRING)
    private Languages language;
    private boolean Disabilitystatus;
    private int creditScore;              // CIBIL / Experian score
    private String riskCategory;          // LOW, MEDIUM, HIGH
    private boolean politicallyExposedPerson; // compliance requirement

}
