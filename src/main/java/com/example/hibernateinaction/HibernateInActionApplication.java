package com.example.hibernateinaction;

import lombok.Data;
import lombok.Generated;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class HibernateInActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateInActionApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(final CustomerService customerService, final ProductService productService)
	{
		return args -> {
			Customer customer = new Customer();
			customer.setName("Baris");
			customer.setType(CustomerType.ELITE);
			customer.setBalance(100);
			customerService.create(customer);

			// Products
			Product p1 = new Product();
			p1.setTitle("iphone");
			p1.setPrice(BigDecimal.valueOf(1000));
			p1.setCustomer(customer);
			productService.create(p1);

			Product p2 = new Product();
			p2.setTitle("android");
			p2.setPrice(BigDecimal.valueOf(1000));
			p2.setCustomer(customer);
			productService.create(p2);


			List<Customer> customers = customerService.list();

			System.out.println(customer);

		};
	}
}


