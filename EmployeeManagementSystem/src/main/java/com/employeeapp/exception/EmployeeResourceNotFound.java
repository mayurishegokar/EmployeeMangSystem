package com.employeeapp.exception;

public class EmployeeResourceNotFound extends RuntimeException {
	
	public EmployeeResourceNotFound(String message)
	{
		super(message);
	}
}
