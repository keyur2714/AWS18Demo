package com.webstack.awsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webstack.awsdemo.dto.EmployeeDTO;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello Radhe Krishna....!";
	}
	
	@GetMapping("/employee")
	public ResponseEntity<EmployeeDTO> getEmployee(){
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setId(32l);
		employeeDTO.setName("Keyur");		
		employeeDTO.setCity("Pune");
		employeeDTO.setSalary(22222d);
				
		 return new ResponseEntity<>(employeeDTO, 
				   HttpStatus.OK);		
	}
	
}
