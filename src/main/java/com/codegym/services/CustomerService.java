package com.codegym.services;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);
}
