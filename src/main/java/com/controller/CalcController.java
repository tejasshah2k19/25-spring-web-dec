package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalcController {

	@GetMapping("inputcalc")
	public String inputCalc() {
		return "InputCalc";// jsp name
	}

	@PostMapping("calc")
	public String calc(Integer n1, Integer n2, String choice, Model model) {
		Integer ans = -1;

		if (choice.equals("add")) {
			ans = n1 + n2;
		} else if (choice.equals("sub")) {
			ans = n1 - n2;
		} else if (choice.equals("mul")) {
			ans = n1 * n2;
		} else if (choice.equals("div")) {
			ans = n1 / n2;
		}

		model.addAttribute("ans", ans);

		return "OutputCalc";// jsp name
	}
}
