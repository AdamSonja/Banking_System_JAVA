package com.bms.bankmanagementsystem.model.User;

import com.bms.bankmanagementsystem.Enum.UserEnum.VerificationMethod;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class UserKYC {
    //Core
    @Id
    private boolean kycCompleted;
    private LocalDate kycSubmissionDate;
    private LocalDate kycApprovalDate;
    @OneToOne
    @JoinColumn(name = "User_id",nullable = false,unique = true)

    private UserKYC UserKYC; // PENDING, VERIFIED, REJECTED

    private String remarks;// e.g., "Address proof unclear"

    //User Identification
    private String aadhaarNumber;   // India
    private String panNumber;       // India (for tax)
    private String passportNumber;
    private String voterId;
    private String drivingLicenseNumber;
    private String rationCardNumber;
    private String nregaJobCard;

    //Address Proof
    private String addressProofType;  // AADHAAR, UTILITY_BILL, RENT_AGREEMENT
    private LocalDate addressProofIssueDate;
    private LocalDate addressProofExpiryDate;

    // rural India

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] aadhaarDocument;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] panDocument;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] passportDocument;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] addressProofDocument;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] photo;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] fingerprintScan;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private byte[] irisScan;

    private boolean pepFlag; // Politically Exposed Person
    private boolean blacklistFlag;
    private boolean sanctionsCheckPassed;
    private String riskCategory; // LOW, MEDIUM, HIGH

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String verifiedBy; // bank staff ID
    private VerificationMethod verificationMethod; // MANUAL, eKYC, VIDEO_KYC




}
