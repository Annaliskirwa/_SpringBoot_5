package com.kcbgroup.main.kcbcustomercreate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private long customerId;
    private String firstName;
    private String lastName;
    private String identificationNumber;
    private String phoneNumber;
}
