package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Employee;
import com.employeeapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeServiceI {
	
	@Autowired
	EmployeeRepository er;

	@Override
	public List getAllEmployee() {
		
		List<Employee> employee=er.findAll();
		return employee;
	}

}
