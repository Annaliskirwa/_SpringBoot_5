package com.kcbgroup.main.kcbcustomercreate.repository;

import com.kcbgroup.main.kcbcustomercreate.entity.Customer;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByIdentificationNumber(String identificationNumber);

}
