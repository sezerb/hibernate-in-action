package com.example.hibernateinaction;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    List<Customer> list() {
        return this.customerService.list();
    }

    @PostMapping
    @ResponseStatus(org.springframework.http.HttpStatus.CREATED)
    Customer create(@RequestBody final Customer customer) {
        return this.customerService.create(customer);
    }

    @DeleteMapping
    @ResponseStatus(org.springframework.http.HttpStatus.NO_CONTENT)
    void delete(@RequestParam final Long id) {
        this.customerService.delete(id);
    }

}
