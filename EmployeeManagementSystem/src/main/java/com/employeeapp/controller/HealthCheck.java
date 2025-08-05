package com.employeeapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheck {
	
	@GetMapping
	public String gethealth()
	{
		return "Health-Check Done";
		
	}

}
