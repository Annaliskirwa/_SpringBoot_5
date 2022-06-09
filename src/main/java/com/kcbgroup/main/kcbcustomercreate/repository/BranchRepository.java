package com.kcbgroup.main.kcbcustomercreate.repository;

import com.kcbgroup.main.kcbcustomercreate.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BranchRepository extends JpaRepository<Branch, Long> {
    Optional<Branch> findByBranchName(String branchName);
}
