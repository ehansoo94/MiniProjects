package com.ehansoo94.planner.member;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ehansoo94.planner.dailyboard.DailyBoardDAO;

@Controller
public class MemberController {

	@Autowired
	private MemberDAO mDAO;
	
	@Autowired
	private DailyBoardDAO dayDAO;
	
	// 로그인
	@RequestMapping(value="/member.login", method = RequestMethod.POST)
	public String login(Model model, HttpServletRequest req, HttpServletResponse res) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		mDAO.login(req, res);
		if (MemberDAO.loginCheck(req)) {
			req.setAttribute("content", "planner.jsp");
			dayDAO.createDailyBoard(req);
			dayDAO.getDailyBoard(req);
			return "main";
		}
		
		req.setAttribute("loginPage", "login.jsp");
		return "index";
	}
	
	// 로그아웃
	@RequestMapping(value="/member.logout", method = RequestMethod.GET)
	public String logout(Model model, HttpServletRequest req) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		req.setAttribute("loginPage", "login.jsp");
		
		MemberDAO.logout(req);
		
		return "index";
	}
	
	// 회원가입 페이지로 이동하기
	@RequestMapping(value="/go.signup", method = RequestMethod.GET)
	public String goSignup(Model model, HttpServletRequest req) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		req.setAttribute("loginPage", "signup.jsp");
		
		return "index";
	}
	
	// 회원가입
	@RequestMapping(value="/member.signup", method = RequestMethod.POST)
	public String signup(Model model, HttpServletRequest req, Member m) {
		
		mDAO.signup(m, req);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		req.setAttribute("loginPage", "login.jsp");
		
		return "index";
	}
}
