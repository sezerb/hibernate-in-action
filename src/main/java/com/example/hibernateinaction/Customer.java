package com.example.hibernateinaction;

import lombok.Data;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CustomerType type;

    private Metadata metadata;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<Product> products;

    private int balance;

}