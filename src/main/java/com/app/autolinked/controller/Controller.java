package com.app.autolinked.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controller {
	@GetMapping(value = "/")
	ResponseEntity<String> fun()
	{
		return ResponseEntity.ok("DONE!");
		
	}
	
}
