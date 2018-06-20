package io.spring.tutorial.part06.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import io.spring.tutorial.part06.model.Student;

@Controller
@RequestMapping("/student")
public class StudentsController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "_06student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute Student student, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors())
			return "_06student-form";
		else
			return "_06studentConfirmation";
	}
}
