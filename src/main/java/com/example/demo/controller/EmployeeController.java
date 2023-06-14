package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	//using property injection
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("all-employees")
	public ResponseEntity<List<Employee>> getALlEmployee(){
		
		//need to call Service ------- 
		
		employeeService.getALlEmployee();
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
