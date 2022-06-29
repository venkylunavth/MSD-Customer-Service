package com.CustomerPackage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerPackage.Model.Customer;
import com.CustomerPackage.repository.CustomerRepository;

import lombok.Builder;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	
	public List<Customer> getAll() {
		return repo.findAll();
	}
	
	public void addCustomer(Customer customer) {
		repo.save(customer);
	}
	public void deleteCustomer(int id) {
		repo.delete(Customer.builder().id(id).build());
	}
}
