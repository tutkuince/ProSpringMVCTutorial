package io.spring.tutorial.part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping("/showPage")
	public String showPage() {
		return "_01showPage";
	}
}
