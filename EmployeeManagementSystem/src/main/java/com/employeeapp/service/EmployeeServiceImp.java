package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.exception.EmployeeResourceNotFound;
import com.employeeapp.model.Employee;
import com.employeeapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeServiceI {
	
	@Autowired
	EmployeeRepository er;
	
	@Override
	public Employee saveEmployee(Employee emp) {
		Employee employee= er.save(emp);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> employee=er.findAll();
		return employee;
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Employee employee=er.findById(id).orElseThrow(()-> new EmployeeResourceNotFound("Employee doesn't Exist..."));
		return employee;
	}

	@Override
	public Employee updateEmployeeById(Long id, Employee emp) {
		Employee employee=er.findById(id).orElseThrow(()-> new EmployeeResourceNotFound("Employee Doesn't Exist..."));
		
		employee.setName(emp.getName());
		employee.setEmail(emp.getEmail());
		employee.setContact(emp.getContact());
		employee.setAddress(emp.getAddress());
		er.save(emp);
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(Long id) {
		Employee employee=er.findById(id).orElseThrow(()-> new EmployeeResourceNotFound("Employee Doesn't Exist..."));
         er.deleteById(id);
		return employee;
	}

}
