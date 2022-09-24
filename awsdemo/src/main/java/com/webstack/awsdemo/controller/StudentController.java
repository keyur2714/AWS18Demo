package com.webstack.awsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webstack.awsdemo.dto.StudentDTO;
import com.webstack.awsdemo.service.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/list")
	public ResponseEntity<List<StudentDTO>> list() {
		return new ResponseEntity<>(studentService.list(), HttpStatus.OK);
	}

}
