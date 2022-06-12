package com.kcbgroup.main.kcbcustomercreate.dto;

import com.kcbgroup.main.kcbcustomercreate.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDto {
    private String customerFirstName;
    private String customerLastName;
    private String customerIdentificationNumber;
    private String customerPhoneNumber;
    private String accountNumber;
    private String accountName;

}
