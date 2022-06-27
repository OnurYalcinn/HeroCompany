package com.works.repositories;

import com.works.entities.Admin;
import com.works.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByEmailEqualsIgnoreCase(String email);
    Optional<Customer> findByVerificationCodeEquals(String verificationCode);

    Optional<Customer> findById(Long id);

}