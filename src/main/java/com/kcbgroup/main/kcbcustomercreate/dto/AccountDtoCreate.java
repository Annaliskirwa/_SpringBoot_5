package com.kcbgroup.main.kcbcustomercreate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AccountDtoCreate {
    private String accountNumber;
    private String accountName;
}
