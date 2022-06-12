package com.kcbgroup.main.kcbcustomercreate.service;

import com.kcbgroup.main.kcbcustomercreate.entity.Customer;
import com.kcbgroup.main.kcbcustomercreate.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer createCustomer(Customer customer);
    Customer updateCustomer(String identificationNumber, Customer customer) throws ResourceNotFoundException;
    String deleteCustomer(String identificationNumber) throws ResourceNotFoundException;
    Customer findByIdentificationNumber(String identificationNumber) throws ResourceNotFoundException;
}
