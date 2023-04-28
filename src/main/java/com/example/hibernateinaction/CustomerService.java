package com.example.hibernateinaction;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Transactional
    public List<Customer> list() {
        return this.customerRepository.findAll();
    }

    @Transactional
    public Customer create(Customer customer) {
        return this.customerRepository.save(customer);
    }

    @Transactional
    public void delete(Long id) {
        this.customerRepository.deleteById(id);
    }
}
