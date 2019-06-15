package com.davidonus.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	// return the home page
	@RequestMapping("index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");

		return mv;
		/*
		 * HttpSession session = req.getSession(); String aname =
		 * req.getParameter("name"); System.out.println("Page Accessed. Hello " +
		 * aname); session.setAttribute("name", aname); return "index";
		 */
	}
}