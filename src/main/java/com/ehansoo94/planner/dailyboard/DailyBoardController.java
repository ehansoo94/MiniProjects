package com.ehansoo94.planner.dailyboard;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DailyBoardController {

	@Autowired
	private DailyBoardDAO dayDAO;
	
	@RequestMapping(value="/dailyboard.show", method = RequestMethod.POST)
	public String showDailyBoard(Model model, HttpServletRequest req) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		// 추가할 기능 
			// 날짜에 해당하는 값이 있는지 확인 
			// 없다면 insert 문을 실행
			// 이후 select 문을 실행해 값을 가져온다.
				// 이후 보기좋게 나타내는 것은 jsp 에서 이루어짐.
		
		req.setAttribute("content", "planner.jsp");
		return "main";
	}
	
	@RequestMapping(value="/dailyboard.insertScedule", method = RequestMethod.POST)
	public String insertSchedule(Model model, HttpServletRequest req) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		// 추가할 기능
			// scedule 의 내용을 변경하는 update문 실행하기
		
		req.setAttribute("content", "planner.jsp");
		return "main";
	}
	
	@RequestMapping(value="/dailyboard.insertTodoList", method = RequestMethod.POST)
	public String insertTodoList(Model model, HttpServletRequest req) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		// 추가할 기능
			// TodoList의 내용을 변경하는 update문 실행하기
		
		req.setAttribute("content", "planner.jsp");
		return "main";
	}
	
	@RequestMapping(value="/dailyboard.insertReview", method = RequestMethod.POST)
	public String insertReview(Model model, HttpServletRequest req) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		Date date = new Date();
		model.addAttribute("date", sdf.format(date));
		
		// 추가할 기능
			// Review의 내용을 변경하는 update문 실행하기
		
		req.setAttribute("content", "planner.jsp");
		return "main";
	}
	
}
