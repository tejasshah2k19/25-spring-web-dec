package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SessionController {
	
	@GetMapping("/signup")
	public String signup() {
		return "Signup";//jsp name
	}

	//read 
	//form submit method=post 
	@PostMapping("/saveUser")
	public String saveUser(String firstName,String lastName,String email,String password) {
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
		
		//validation 
		
		//db insertion 
		return "Login";
	}
	
	@GetMapping("login")
	public String login() {
		return "Login";
	}
	
	
}
