package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<Employee> getALlEmployee() {

		ResponseEntity<String> data = restTemplate.getForEntity("http://localhost:8080/get-data", String.class);
		
		return null;
	}

}
