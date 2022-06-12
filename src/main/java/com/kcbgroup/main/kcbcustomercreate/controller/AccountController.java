package com.kcbgroup.main.kcbcustomercreate.controller;

import com.kcbgroup.main.kcbcustomercreate.dto.AccountDto;
import com.kcbgroup.main.kcbcustomercreate.dto.AccountDtoCreate;
import com.kcbgroup.main.kcbcustomercreate.entity.Account;
import com.kcbgroup.main.kcbcustomercreate.exception.ResourceNotFoundException;
import com.kcbgroup.main.kcbcustomercreate.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    public List<AccountDto> getAllAccounts() {

        return accountService.getAllAccounts().stream().map(account -> modelMapper.map(account, AccountDto.class)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> findByAccountNumber(@PathVariable(name = "id") String accountNumber) throws ResourceNotFoundException {
        Account account = accountService.findByAccountNumber(accountNumber);

        AccountDto accountResponse = modelMapper.map(account, AccountDto.class);
        return ResponseEntity.ok().body(accountResponse);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }
    @PutMapping("/{id}")
    public Account updateAccount(@PathVariable(name = "id")String accountNumber, @RequestBody Account account) throws  ResourceNotFoundException{
        return accountService.updateAccount(accountNumber, account);
    }
    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable(name = "id") String accountNumber) throws ResourceNotFoundException{
        return accountService.deleteAccount(accountNumber);
    }
}
