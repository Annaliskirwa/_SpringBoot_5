package com.kcbgroup.main.kcbcustomercreate.service;

import com.kcbgroup.main.kcbcustomercreate.entity.Account;
import com.kcbgroup.main.kcbcustomercreate.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    List<Account> getAllAccounts();
    Account createAccount(Account account);
    Account updateAccount(String accountNumber, Account account) throws ResourceNotFoundException;
    String deleteAccount(String accountNumber) throws ResourceNotFoundException;
    Account findByAccountNumber(String accountNumber) throws ResourceNotFoundException;
}
