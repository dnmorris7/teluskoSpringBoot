package com.davidonus.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HomeController {

	
	
	
	//return the home page
	@RequestMapping("home")
	public String home() {
		System.out.println("Hi");

		
		return "home";
	}
}

