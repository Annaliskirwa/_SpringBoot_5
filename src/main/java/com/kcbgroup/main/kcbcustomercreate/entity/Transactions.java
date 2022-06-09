package com.kcbgroup.main.kcbcustomercreate.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "KEN20950_TRANSACTIONS")
@NoArgsConstructor
@AllArgsConstructor
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long transactionsId;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Column(name = "referenceNumber", nullable = false)
    private String referenceNumber;

    @Column(name = "transactionCode", nullable = false)
    private String transactionCode;
}
