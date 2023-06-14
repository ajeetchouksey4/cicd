package com.example.demo.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee_new")
public class Employee {
	
	@Id
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	
	private String name;
	private String address;
	private String dept;

}
