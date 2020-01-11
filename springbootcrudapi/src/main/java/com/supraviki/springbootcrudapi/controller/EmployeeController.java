package com.supraviki.springbootcrudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supraviki.springbootcrudapi.model.Employee;
import com.supraviki.springbootcrudapi.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired 
	private EmployeeService employeeservice;
	
	@GetMapping("/employee")
	public List<Employee> geet()
	{ 
		return employeeservice.get();
	}
	
	@PostMapping("/employee/login")
	public Employee save(@RequestBody Employee employeeobj) {
		employeeservice.save(employeeobj);
		
		return employeeobj;
		
	}
	
	
	

}
