package com.CustomerPackage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerPackage.Model.Customer;
import com.CustomerPackage.Service.CustomerService;
import com.google.gson.Gson;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	//Display Home
	@GetMapping("/")
	public String home() {
		return "Customer Home page";
	}
	
	@PostMapping("/addcustomer")
	public String addCustomer(int id, String name,String email,String mobile) {
		cs.addCustomer(Customer.builder().id(id).name(name).email(email).mobile(mobile).build());
		return "Customers Added";
	}
	@GetMapping("/getcustomer")
	public String getAll() {
		Gson gson = new Gson();
		String json=gson.toJson(cs.getAll());
		return json;
	}
	
	public String deleteCustomer(int id) {
		cs.deleteCustomer(id);
		return "Customer deleted";
	}
	

}
