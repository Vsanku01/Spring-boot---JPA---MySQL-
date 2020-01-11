package com.supraviki.springbootcrudapi.dao;


import java.util.List;

import com.supraviki.springbootcrudapi.model.Employee;
public interface EmployeeDAO {
	
	//To get the list of employees
	List<Employee> get();
	//To get the details of single employee we use the get method with id as param
	
	Employee get(int id);
	//To save the data into the database
	
	void save(Employee employee);
	//To delete the record from the database
	
	void delete(int id);
	

}
