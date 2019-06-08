package com.davidonus.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// return the home page
	@RequestMapping("home")
	public String home(HttpServletRequest req, HttpServletResponse res) {

		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("Page Accessed. Hello " + name);
		session.setAttribute("name", name);
		return "home";
	}
}
