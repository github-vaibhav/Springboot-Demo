package com.customer.ms.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.ms.controller.Customer;

@Service
public class CustomerDetailsService {
	
	private List<Customer> Cust = new ArrayList<>(Arrays.asList(
			new Customer("1","Vaibhav","34","625327874"),
			new Customer("2","Anil","35","125327872"),
			new Customer("3","Karan","36","340978701")		
			));

	public List<Customer> getcustomerdetails(){
		 return Cust;
		
	}

	public void addCustomer(Customer customer) {
		Cust.add(customer);
		
	}

	public void updateCustomer(String Name, Customer customer) {
		for(int i=0;i < Cust.size(); i++) {
			Customer c=Cust.get(i);
			if(c.getName().equals(Name)) {
				Cust.set(i, customer);
				return;
				
			}
		}
		
	}

	public void deletecustomer(String name) {
		Cust.removeIf(c -> c.getName().equals(name));
	
	}
	
}
