package com.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.employeeapp.model.Employee;
import com.employeeapp.service.EmployeeServiceI;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceI esi;
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp)
	{
		Employee employee=esi.saveEmployee(emp);
		return ResponseEntity.status(HttpStatus.CREATED).body(employee);
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployee()
	{
		List<Employee> employee=esi.getAllEmployee();
		return ResponseEntity.ok(employee);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id)
	{
		Employee employee=esi.getEmployeeById(id);
		return ResponseEntity.ok(employee);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee emp)
	{
		Employee employee=esi.updateEmployeeById(id,emp);
		return ResponseEntity.ok(employee);	
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") Long id)
	{
		Employee employee=esi.deleteEmployeeById(id);
		return ResponseEntity.ok(employee);	
	}
}
