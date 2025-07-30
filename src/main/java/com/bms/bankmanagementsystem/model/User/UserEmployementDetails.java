package com.bms.bankmanagementsystem.model.User;

import com.bms.bankmanagementsystem.Enum.UserEnum.JobType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEmployementDetails {
    //Employment Details
    private JobType jobType;
    private String CompanyName;
    private String Occupation;
    private String Designation;
    private String Salary;
    private String EmploymentType;
    private String Department;
    protected boolean governmentEmployee;  // Y/N
    protected boolean pensionEligible;     // Y/N
    protected boolean nriStatus;           // Non-resident Indian flag

}
