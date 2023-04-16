package com.example.hibernateinaction;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Metadata metadata;

    private BigDecimal price;

    //private BigDecimal tax;

//    @ManyToOne
//    private Customer customer;
}

