package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {

	@GetMapping("/signup")
	public String signup() {
		return "Signup";// jsp name
	}

	// read
	// form submit method=post
	@PostMapping("/saveUser")
	public String saveUser(@Validated UserBean user, BindingResult result,Model model) {
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());

		// validation
		if (result.hasErrors()) {
			model.addAttribute("result",result);
			return "Signup";
		} else {
			// db insertion
			return "Login";
		}
	}

	@GetMapping("login")
	public String login() {
		return "Login";
	}

}
