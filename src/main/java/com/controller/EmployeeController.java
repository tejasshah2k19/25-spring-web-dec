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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

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
			// db -> employees
			return "redirect:/listEmployees";// url , not jsp
		}
	}

	@GetMapping("listEmployees")
	public String listEmployees(Model model) {
		List<EmployeeBean> employess = employeeDao.getAllEmployees(); // List<EmployeeBean> select * from employees;
		// jdbcTemplate.query()
		model.addAttribute("employess", employess);
		return "ListEmployees";
	}

	@GetMapping("deleteUser")
	public String deleteUser(Integer employeeId) {
		System.out.println("Delete User :: " + employeeId);
		// query
		// delete from employees where employeeId = ?
		employeeDao.deleteEmployee(employeeId);
		return "redirect:/listEmployees";
	}

	@GetMapping("inputSearch")
	public String inputSearch() {
		return "InputSearch";
	}

	@PostMapping("search")
	public String search(String firstName,Model model) {
		List<EmployeeBean> employees = employeeDao.searchByFirstName(firstName);
		System.out.println(employees.size());//5
		model.addAttribute("employess",employees);
		return "ListEmployees";
	}

}
