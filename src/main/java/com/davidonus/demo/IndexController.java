package com.davidonus.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	ModelAndView mv;

	// return the home page
	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");

		return mv;

	}

	@RequestMapping("index2")
	public ModelAndView index2() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index2");

		return mv;

	}

	@RequestMapping("index3")
	public ModelAndView index3() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index3");

		return mv;

	}
	@RequestMapping("index4")
	public ModelAndView index4() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index4");
		
		return mv;
	
	}	
	
	@RequestMapping("index5")
	public ModelAndView index5() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index5");
		
		return mv;
		
	}	
	
	@RequestMapping("FinalDistraction")
	public ModelAndView finalDistraction() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FinalDistraction");
		
		return mv;
		
	}
}