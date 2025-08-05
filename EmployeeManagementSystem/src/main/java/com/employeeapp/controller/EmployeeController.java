package com.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.employeeapp.model.Employee;
import com.employeeapp.service.EmployeeServiceI;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceI esi;
	
	@GetMapping
	public ResponseEntity<List<Employee>> getAll()
	{
		List<Employee> employee=esi.getAllEmployee();
		return ResponseEntity.ok(employee);
	}

}
