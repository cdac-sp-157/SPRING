package com.springecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication( scanBasePackages = {"com.springecommerce.controllers", "com.springecommerce.services"})
@EntityScan(basePackages= {"com.springecommerce.entities"})
@EnableJpaRepositories(basePackages = {"com.springecommerce.repositries"})
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}
	
	 

}
