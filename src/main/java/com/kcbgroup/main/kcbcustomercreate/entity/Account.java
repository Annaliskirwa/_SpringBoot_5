package com.kcbgroup.main.kcbcustomercreate.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "KEN20950_ACCOUNT")
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long accountId;

    @Column(name = "accountNumber", nullable = false)
    private String accountNumber;

    @Column(name = "availableBalance")
    private BigDecimal availableBalance;

    @Column(name = "actualBalance")
    private BigDecimal actualBalance;

    @Enumerated(EnumType.STRING)
    private AccountType Type;

    @Enumerated(EnumType.STRING)
    private AccountStatus Status;

}
