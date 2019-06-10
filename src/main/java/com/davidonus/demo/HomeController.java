package com.davidonus.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// return the home page
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName) {
		myName = "David";
		ModelAndView mv = new ModelAndView();
		System.out.println("Page Accessed. Hello " +  myName);
		
		mv.addObject("name", myName);
		mv.setViewName("home");
		return mv;
	}
}
