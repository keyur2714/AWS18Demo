package com.webstack.awsdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public ResponseEntity<String> health() {
		  return new ResponseEntity<>("Hello Radhe Krishna...!", 
				   HttpStatus.OK);
	}
}
