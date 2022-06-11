package com.kcbgroup.main.kcbcustomercreate.controller;

import com.kcbgroup.main.kcbcustomercreate.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kcbCustomerCreate/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
}
