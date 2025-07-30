package com.bms.bankmanagementsystem.model.User;

import com.bms.bankmanagementsystem.Enum.UserEnum.Country;
import com.bms.bankmanagementsystem.Enum.UserEnum.JobLocationType;
import com.bms.bankmanagementsystem.Enum.UserEnum.State;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserAddress {
    @Id
    private Long id;

    //Address Info
    private String Residentialaddress;
    private String Permanentaddress;
    @Enumerated(EnumType.STRING)
    private Country country;
    private String EducationQualification;
    private State state;
    private String city;
    private String pincode;

    //Job Address Info
    private JobLocationType jobLocationType;
    private String officeAddress;
    private String officeCity;
    private String officeState;
    private String officeCountry;
    private String officePincode;
    private String officePhone;


}
