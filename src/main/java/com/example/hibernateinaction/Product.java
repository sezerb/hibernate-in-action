package com.example.hibernateinaction;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.hibernate.annotations.Formula;

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
    
    @Formula(value = "price * 0.18")
    private BigDecimal tax;

    @ManyToOne
    private Customer customer;
}

