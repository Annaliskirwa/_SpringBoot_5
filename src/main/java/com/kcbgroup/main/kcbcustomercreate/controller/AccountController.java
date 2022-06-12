package com.kcbgroup.main.kcbcustomercreate.controller;

import com.kcbgroup.main.kcbcustomercreate.entity.Account;
import com.kcbgroup.main.kcbcustomercreate.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("kcbCustomerCreate/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }
}
