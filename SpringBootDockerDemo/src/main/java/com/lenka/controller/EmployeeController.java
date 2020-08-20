package com.lenka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lenka.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping
	public Employee getEmployee() {
		return new Employee(1, "Pradyumna", "Odisha");
	}

}
