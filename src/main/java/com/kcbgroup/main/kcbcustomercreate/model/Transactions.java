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
public class Transactions {
    private long transactionsId;
    private BigDecimal amount;
    private String referenceNumber;
    private String transactionCode;
}
