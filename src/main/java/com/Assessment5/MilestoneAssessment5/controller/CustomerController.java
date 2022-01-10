package com.Assessment5.MilestoneAssessment5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.Assessment5.MilestoneAssessment5.model.Customer;
import com.Assessment5.MilestoneAssessment5.repository.CustomerRepository;

@RestController
@RequestMapping("/api/")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("customers")
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
}
