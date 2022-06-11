package com.kcbgroup.main.kcbcustomercreate.controller;

import com.kcbgroup.main.kcbcustomercreate.dto.CustomerDto;
import com.kcbgroup.main.kcbcustomercreate.repository.CustomerRepository;
import com.kcbgroup.main.kcbcustomercreate.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("kcbCustomerCreate/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    private ModelMapper modelMapper;

    @GetMapping
    public List<CustomerDto> getAllCustomers(){
        return customerService.getAllCustomers().stream().map(customer -> modelMapper.map(customer, CustomerDto.class)).collect(Collectors.toList());
    }
}
