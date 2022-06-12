package com.kcbgroup.main.kcbcustomercreate.service;

import com.kcbgroup.main.kcbcustomercreate.entity.Account;
import com.kcbgroup.main.kcbcustomercreate.entity.Customer;
import com.kcbgroup.main.kcbcustomercreate.exception.ResourceNotFoundException;
import com.kcbgroup.main.kcbcustomercreate.repository.AccountRepository;
import com.kcbgroup.main.kcbcustomercreate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account updateAccount(String accountNumber, Account accountUpdate)throws ResourceNotFoundException {
        Account account = accountRepository.findByAccountNumber(accountNumber).orElseThrow(()-> new ResourceNotFoundException("The account with account Number : "+ accountNumber + "has not been found"));
        account.setAccountName(accountUpdate.getAccountName());
        return accountRepository.save(account);
    }

    @Override
    public String deleteAccount(String accountNumber) throws ResourceNotFoundException {
        Account account = accountRepository.findByAccountNumber(accountNumber).orElseThrow(()-> new ResourceNotFoundException("The account with account Number : "+ accountNumber + "has not been found"));
        accountRepository.delete(account);
        return("The account with account number" + accountNumber + "has been deleted");
    }

    @Override
    public Account findByAccountNumber(String accountNumber) throws ResourceNotFoundException  {
        Optional<Account> result = accountRepository.findByAccountNumber(accountNumber);
        if (result.isPresent()){
            return result.get();
        }else{
            throw new ResourceNotFoundException("The account with account Number" + accountNumber + "has not been found");
        }
    }
}
