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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountId", referencedColumnName = "accountId")
    private Account account;

//    Getter and setters

    public long getTransactionsId() {
        return transactionsId;
    }

    public void setTransactionsId(long transactionsId) {
        this.transactionsId = transactionsId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }
//    to string

    @Override
    public String toString() {
        return "Transactions{" +
                "transactionsId=" + transactionsId +
                ", amount=" + amount +
                ", transactionType=" + transactionType +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", transactionCode='" + transactionCode + '\'' +
                '}';
    }
}
