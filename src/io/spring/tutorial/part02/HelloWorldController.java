package io.spring.tutorial.part02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "_02showForm";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "_02processForm";
	}
	
	@RequestMapping("/")
	public String mainMenu() {
		return "_02mainMenu";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		// Read the request parameter from the HTML form
		String name = request.getParameter("studentName");
		
		// Convert the data to all caps
		name = name.toUpperCase();
		
		// Create the message
		String result = "Welcome to our community Mr/Ms " + name;
		
		// Add message to model
		model.addAttribute("message", result);
		
		return "_02processForm";
	}
}
