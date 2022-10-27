package com.ehansoo94.planner.member;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {

	@RequestMapping(value="/member.login", method = RequestMethod.POST)
	public String login(Model model, HttpServletRequest req) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		req.setAttribute("content", "planner.jsp");
		
		return "main";
	}
	
	@RequestMapping(value="/member.logout", method = RequestMethod.GET)
	public String logout(Model model, HttpServletRequest req) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		req.setAttribute("loginPage", "login.jsp");
		
		return "index";
	}
	
	@RequestMapping(value="/go.signup", method = RequestMethod.GET)
	public String goSignup(Model model, HttpServletRequest req) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		req.setAttribute("loginPage", "signup.jsp");
		
		return "index";
	}
	
	@RequestMapping(value="/member.signup", method = RequestMethod.GET)
	public String signup(Model model, HttpServletRequest req) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		req.setAttribute("loginPage", "login.jsp");
		
		return "index";
	}
}
