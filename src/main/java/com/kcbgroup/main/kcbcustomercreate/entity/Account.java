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

//    @Enumerated(EnumType.STRING)
//    private AccountType Type;

//    @Enumerated(EnumType.STRING)
//    private AccountStatus Status;

    @ManyToOne
    @JoinColumn(name = "customerId", referencedColumnName = "customerId")
    private Customer customer;

//    Getter and setter
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getActualBalance() {
        return actualBalance;
    }

    public void setActualBalance(BigDecimal actualBalance) {
        this.actualBalance = actualBalance;
    }

//    public AccountType getType() {
//        return Type;
//    }
//
//    public void setType(AccountType type) {
//        Type = type;
//    }

//    public AccountStatus getStatus() {
//        return Status;
//    }
//
//    public void setStatus(AccountStatus status) {
//        Status = status;
//    }

//    to string

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountNumber='" + accountNumber + '\'' +
                ", availableBalance=" + availableBalance +
                ", actualBalance=" + actualBalance +
//                ", Type=" + Type +
//                ", Status=" + Status +
                '}';
    }
}
