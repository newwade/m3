package com.m3.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "<h1>Welcome to spring boot</h1>";
	}
	

}
