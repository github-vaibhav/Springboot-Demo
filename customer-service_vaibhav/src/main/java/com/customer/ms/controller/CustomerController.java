package com.customer.ms.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.ms.service.CustomerDetailsService;





@RestController
public class CustomerController {
	
	@Autowired
	private CustomerDetailsService customerdetailsservice;
	
	@RequestMapping("/customerdetails")
	public List<Customer> getcustomerdetails() {
		return customerdetailsservice.getcustomerdetails();
	
	}

	
	@RequestMapping(method=RequestMethod.POST, value="/customerdetails")
	public void addCustomer(@RequestBody Customer customer) {
		customerdetailsservice.addCustomer(customer);
	
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, value="/customerdetails/{Name}")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable String Name) {
		customerdetailsservice.updateCustomer(Name,customer);
	
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customerdetails/{Name}")
	public void deleteCustomer(@PathVariable String Name) {
		customerdetailsservice.deletecustomer(Name);
		
	}
	
}
