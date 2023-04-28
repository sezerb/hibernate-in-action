package com.example.hibernateinaction;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    @Transactional
    public List<Product> list() {
        return productRepository.findAll();
    }

    @Transactional
    public Product create(Product product) {
        return productRepository.save(product);
    }

}
