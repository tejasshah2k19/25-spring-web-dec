package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.EmployeeBean;

@Controller
public class EmployeeController {

	@GetMapping("newEmp")
	public String newEmp() {
		return "NewEmp";
	}

	@PostMapping("saveEmployee")
	public String saveEmployee(@Validated EmployeeBean employeeBean, BindingResult result,Model model) {

		if (result.hasErrors()) {
			model.addAttribute("result",result);
			return "NewEmp";
		} else {
			//db insert 
			return "Login";
		}
	}
}
