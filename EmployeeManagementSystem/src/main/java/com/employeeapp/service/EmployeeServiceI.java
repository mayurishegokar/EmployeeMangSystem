package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Employee;

public interface EmployeeServiceI {

	public List<Employee> getAllEmployee();

	public Employee saveEmployee(Employee emp);

	public Employee getEmployeeById(Long id);

	public Employee updateEmployeeById(Long id, Employee emp);

	public Employee deleteEmployeeById(Long id);

}
