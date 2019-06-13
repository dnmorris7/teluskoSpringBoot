package com.davidonus.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// return the home page
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		/*myName = "David";*/
		/*System.out.println("Page Accessed. Hello " +  alien);*/
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
	}
}
