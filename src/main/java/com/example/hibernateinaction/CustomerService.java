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
        return new ArrayList<>(this.customerRepository.findAll());
    }

    public Customer create(Customer customer) {
        return this.customerRepository.save(customer);
    }
    
    public void delete(Long id) {
        this.customerRepository.deleteById(id);
    }
}
