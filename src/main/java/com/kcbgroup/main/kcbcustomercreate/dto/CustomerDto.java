package com.kcbgroup.main.kcbcustomercreate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private String firstName;
    private String lastName;
    private String identificationNumber;
    private String phoneNumber;


}
