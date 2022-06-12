package com.kcbgroup.main.kcbcustomercreate.controller;

import com.kcbgroup.main.kcbcustomercreate.dto.AccountDto;
import com.kcbgroup.main.kcbcustomercreate.entity.Account;
import com.kcbgroup.main.kcbcustomercreate.exception.ResourceNotFoundException;
import com.kcbgroup.main.kcbcustomercreate.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("kcbCustomerCreate/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<AccountDto> getAllAccounts(){

        return accountService.getAllAccounts().stream().map(account -> modelMapper.map(account, AccountDto.class)).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> findByAccountNumber(@PathVariable(name = "id") String accountNumber) throws ResourceNotFoundException{
        Account account = accountService.findByAccountNumber(accountNumber);

        AccountDto accountResponse = modelMapper.map(account,AccountDto.class);
        return ResponseEntity.ok().body(accountResponse);
    }
}
