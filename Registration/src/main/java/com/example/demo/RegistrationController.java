package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	@PostMapping("/register")
	public ModelAndView register(@RequestParam("name") String name,
								@RequestParam("password") String password,
								@RequestParam("gender") int gender,
								@RequestParam("area") int area,
								@RequestParam("interests") int[] interests,
								@RequestParam("remarks") String remarks,
								ModelAndView mv)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(" "+name);
		sb.append(" "+password);
		sb.append(" "+gender);
		sb.append(" "+area);
		sb.append(" "+Arrays.toString(interests));
		sb.append(" "+remarks);
		mv.setViewName("result");
		mv.addObject("result", sb.toString());
		return mv;
	}
}
