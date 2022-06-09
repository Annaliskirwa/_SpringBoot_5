package com.kcbgroup.main.kcbcustomercreate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {
    private long accountId;
    private String accountNumber;
    private BigDecimal availableBalance;
    private BigDecimal actualBalance;

}
