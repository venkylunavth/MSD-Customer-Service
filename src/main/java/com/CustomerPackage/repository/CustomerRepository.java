package com.CustomerPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CustomerPackage.Model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
