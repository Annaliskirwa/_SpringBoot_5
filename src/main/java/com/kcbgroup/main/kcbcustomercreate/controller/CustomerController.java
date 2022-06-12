package com.kcbgroup.main.kcbcustomercreate.controller;

import com.kcbgroup.main.kcbcustomercreate.dto.CustomerDto;
import com.kcbgroup.main.kcbcustomercreate.entity.Customer;
import com.kcbgroup.main.kcbcustomercreate.exception.ResourceNotFoundException;
import com.kcbgroup.main.kcbcustomercreate.repository.CustomerRepository;
import com.kcbgroup.main.kcbcustomercreate.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("kcbCustomerCreate/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<CustomerDto> getAllCustomers(){
        return customerService.getAllCustomers().stream().map(customer -> modelMapper.map(customer, CustomerDto.class)).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> findByIdentificationNumber(@PathVariable(name="id") String identificationNumber) throws ResourceNotFoundException{
        Customer customer = customerService.findByIdentificationNumber(identificationNumber);

        CustomerDto customerResponse = modelMapper.map(customer,CustomerDto.class);
        return ResponseEntity.ok().body(customerResponse);
    }
    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto){
        Customer customerRequest = modelMapper.map(customerDto, Customer.class);
        Customer customer = customerService.createCustomer(customerRequest);

        CustomerDto customerResponse = modelMapper.map(customer, CustomerDto.class);
        return new ResponseEntity<CustomerDto>(customerResponse, HttpStatus.CREATED);

    }
    @PutMapping("/{id}")
    public  ResponseEntity<CustomerDto> updateCustomer(@PathVariable(name="id") String identificationNumber, @RequestBody CustomerDto customerDto) throws  ResourceNotFoundException{
        Customer customerRequest = modelMapper.map(customerDto, Customer.class);
        Customer customer = customerService.updateCustomer(identificationNumber, customerRequest);

        CustomerDto customerResponse = modelMapper.map(customer, CustomerDto.class);
        return ResponseEntity.ok().body(customerResponse);
    }
}
