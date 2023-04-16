package com.example.hibernateinaction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.List;
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

//    @JsonIgnore
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
//    private Set<Product> products;

    private int balance;

    @Formula(value = "balance * 0.2")
    private int tax;

}