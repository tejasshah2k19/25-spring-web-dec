package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.EmployeeBean;
import com.dao.EmployeeDao;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;

	@GetMapping("newEmp")
	public String newEmp() {
		return "NewEmp";
	}

	@PostMapping("saveEmployee")
	public String saveEmployee(@Validated EmployeeBean employeeBean, BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("result", result);
			return "NewEmp";
		} else {
			// db insert
			employeeDao.addEmployee(employeeBean);
			return "Login";
		}
	}

	@GetMapping("listEmployees")
	public String listEmployees(Model model) {
		List<EmployeeBean> employess = employeeDao.getAllEmployees(); // List<EmployeeBean> select * from employees;
		// jdbcTemplate.query()
		model.addAttribute("employess",employess);
		return "ListEmployees";
	}

}
