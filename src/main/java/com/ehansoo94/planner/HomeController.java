package com.ehansoo94.planner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req, Model model) {
		// 프로젝트를 처음 생성하면, 
		// Model 이라는 파라미터가 서버시간을 나타내주는 역할을 하고 있다.
		// 아직 Model 객체가 무슨 역할을 하는지 잘 모르지만 일단 시간을 표시하기에 좋은 방법인 것 같아서 남겨둠.
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		req.setAttribute("loginPage", "login.jsp");
		
		return "index";
	}

	@RequestMapping(value = "/go.back", method = RequestMethod.GET)
	public String goBack(HttpServletRequest req, Model model) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		req.setAttribute("loginPage", "login.jsp");
		
		return "index";
	}
	
}
