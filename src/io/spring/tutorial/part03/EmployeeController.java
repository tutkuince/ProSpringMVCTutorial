package io.spring.tutorial.part03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "_03showForm";
	}

	@RequestMapping("/processEmployeeForm")
	public ModelAndView processEmployee(@RequestParam(name = "name") String name,
			@RequestParam(name = "surname") String surname, ModelAndView mv) {
		String result = name + " " + surname;

		mv.setViewName("_03processForm");
		mv.addObject("employee", result);
		return mv;
	}
}
