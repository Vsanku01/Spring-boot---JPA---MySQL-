package com.supraviki.springbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supraviki.springbootcrudapi.model.Employee;
import com.supraviki.springbootcrudapi.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeedao;

	@Transactional
	@Override
	public List<Employee> get() {
		return employeedao.get();
	}
	
	@Transactional 
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub 
		return null;
	}
	@Transactional
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeedao.save(employee);
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
