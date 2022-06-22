package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloPractice001Controller {
	
	@PostMapping("/hello")
	public ModelAndView sayHelloString(@RequestParam("name") String name,@RequestParam("age") int age, ModelAndView mv) {
		mv.setViewName("returnHello");
		mv.addObject("name", name);
		mv.addObject("age", age);
		return mv;
	}
}

