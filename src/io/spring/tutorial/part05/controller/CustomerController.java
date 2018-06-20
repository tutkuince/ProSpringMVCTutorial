package io.spring.tutorial.part05.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import io.spring.tutorial.part05.model.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "_05customer-form";
	}

	/**
	 * @Valid: perform validation rules on Customer object
	 * Results of validation placed in the BindingResult
	 * */
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "_05customer-form";
		else
			return "_05customerConfirmation";

	}
}
