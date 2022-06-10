package com.kcbgroup.main.kcbcustomercreate.service;

import com.kcbgroup.main.kcbcustomercreate.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    List<Account> getAllAccounts();
    Account createAccount(Account account);
    Account updateAccount(Long accountId, Account account);
    String deleteAccount(Long accountId);
    Account findByAccountNumber(String accountNumber);
}
