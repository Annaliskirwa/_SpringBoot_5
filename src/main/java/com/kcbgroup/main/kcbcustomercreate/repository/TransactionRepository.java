package com.kcbgroup.main.kcbcustomercreate.repository;

import com.kcbgroup.main.kcbcustomercreate.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {
}
