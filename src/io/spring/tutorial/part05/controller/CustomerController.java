package io.spring.tutorial.part05.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	
	// @InitBinder: pre-process all web requests coming into our Controller
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		// StringTrimmerEdito: removes whitespace - leading and trailing
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		// Pre-process every String from data
		// Removes leading and trailing white space
		// If String only has whitespace trim it to null
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
}
