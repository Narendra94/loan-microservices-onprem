package com.example.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {
	
	private final CustomerRepository repo;
	
	public List<Customer> getAllCustomer() {
		return repo.findAll();
	}
	
	public Customer saveCustomer(Customer customer) {
		return repo.save(customer);
	}

}
