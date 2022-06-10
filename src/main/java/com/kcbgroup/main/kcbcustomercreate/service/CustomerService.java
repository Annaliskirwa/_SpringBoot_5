package com.kcbgroup.main.kcbcustomercreate.service;

import com.kcbgroup.main.kcbcustomercreate.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer createCustomer(Customer customer);
    Customer updateCustomer(String identificationNumber, Customer customer);
    String deleteCustomer(Long customerId);
    Customer findByIdentificationNumber(String identificationNumber);
}
