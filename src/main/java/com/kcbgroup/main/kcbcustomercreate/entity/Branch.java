package com.kcbgroup.main.kcbcustomercreate.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "KEN20950_BRANCH")
@NoArgsConstructor
@AllArgsConstructor
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long branchId;

    @Column(name = "branchCode", nullable = false)
    private String branchCode;

    @Column(name = "branchName", nullable = false)
    private String branchName;

//    Getter and setter
    public long getBranchId() {
        return branchId;
    }

    public void setBranchId(long branchId) {
        this.branchId = branchId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

//    to string

    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", branchCode='" + branchCode + '\'' +
                ", branchName='" + branchName + '\'' +
                '}';
    }
}
