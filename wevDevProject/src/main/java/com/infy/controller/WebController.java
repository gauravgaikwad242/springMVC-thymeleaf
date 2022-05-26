package com.infy.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.infy.dto.Student;

@Controller
public class WebController {
	
	@GetMapping("/hello")
	public String getMethod(Model model) {
		//giving object to the web page
		Student student = new Student("gaurav","gau@gmail.com");
		model.addAttribute("gaurav", student);
		
		//for each loop in the web page
		List<String> list = List.of("gaurav","mehul","manish","yadnesh");
		model.addAttribute("strings", list);
		return "index";
	}
	
	@GetMapping("/condition")
	public String conditionPage(Model model) {
		model.addAttribute("title", "Web Page for Conditional Statements");
		model.addAttribute("statusActive", true);
		List<String> names = List.of("gaurav","mehul","manish","yadnesh");
		model.addAttribute("names", names);
		
		return "condition";
	}
	
	

}
