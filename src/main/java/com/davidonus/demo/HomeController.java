package com.davidonus.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jdk.internal.jline.internal.Log;

import java.util.Date;
import java.time.LocalDate;

import org.apache.log4j.*;

@Controller
public class HomeController {
	
	  static String projectLocation = System.getProperty("user.dir"); 
	   Date date = new Date();
	  String time = String.format("TIME: %tc",date);
	  Logger Log =
	  Logger.getLogger(HomeController.class); String logpath =
	  projectLocation+"//src//main//resources//log4j.properties";
	 

	// return the home page
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		/* myName = "David"; */
		PropertyConfigurator.configure(logpath);
		//asicConfigurator.configure();
		System.out.println("Page Accessed. Hi there " + alien.getAname());
		Log.info("Home Page Accessed " + time);
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
	}
}
