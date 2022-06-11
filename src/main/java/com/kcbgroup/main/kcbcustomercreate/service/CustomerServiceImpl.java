package com.kcbgroup.main.kcbcustomercreate.service;

import com.kcbgroup.main.kcbcustomercreate.entity.Customer;
import com.kcbgroup.main.kcbcustomercreate.repository.CustomerRepository;
import exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements  CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(String identificationNumber, Customer customerUpdate) throws ResourceNotFoundException {
        Customer customer = customerRepository.findByIdentificationNumber(identificationNumber).orElseThrow(()-> new ResourceNotFoundException("The customer with id: "+ identificationNumber + "has not been found"));
        customer.setFirstName(customer.getFirstName());
        customer.setLastName(customer.getLastName());
        customer.setPhoneNumber(customer.getPhoneNumber());
        return customerRepository.save(customer);
    }

    @Override
    public String deleteCustomer(String identificationNumber) {
        Customer customer = customerRepository.findByIdentificationNumber(identificationNumber).orElseThrow(()-> new ResourceNotFoundException("The customer with id: "+ identificationNumber + "has not been found"));
        customerRepository.delete(customer);
        return("\"The customer with id: \"+ identificationNumber + \"has not been deleted\"");
    }

    @Override
    public Customer findByIdentificationNumber(String identificationNumber) {
        return null;
    }
}
