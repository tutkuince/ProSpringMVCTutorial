package io.spring.tutorial.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greetings")
public class GreetController {
	
	@RequestMapping(path = "/greet/{name}", method = RequestMethod.GET)
	public ModelAndView greetings(@PathVariable String name, ModelAndView mv) {
		String greet =" Hello !!!" + name.toUpperCase() + " How are You?";
		mv.addObject("message", greet);
		mv.setViewName("greeting");
		System.out.println(greet);
		return mv;
	}
}
