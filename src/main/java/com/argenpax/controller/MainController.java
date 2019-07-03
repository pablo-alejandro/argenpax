package com.argenpax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/hello")
public class MainController { 
	@GetMapping(value="/welcome")
	public ModelAndView main() {
		return new ModelAndView("welcome");
	}
}