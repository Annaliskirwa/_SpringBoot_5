package com.kcbgroup.main.kcbcustomercreate.service;

import com.kcbgroup.main.kcbcustomercreate.entity.Customer;
import com.kcbgroup.main.kcbcustomercreate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements  CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomer(String identificationNumber, Customer customer) {
        return null;
    }

    @Override
    public String deleteCustomer(Long customerId) {
        return null;
    }

    @Override
    public Customer findByIdentificationNumber(String identificationNumber) {
        return null;
    }
}
