package com.kcbgroup.main.kcbcustomercreate.repository;

import com.kcbgroup.main.kcbcustomercreate.entity.Customer;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

import java.util.Optional;

public interface CustomerRepository extends JpaAttributeConverter<Customer, Long> {
    Optional<Customer> findByIdentificationNumber(String identificationNumber);
}
