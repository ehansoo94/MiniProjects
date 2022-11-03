package com.ehansoo94.planner.dailyboard;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.metadata.SybaseCallMetaDataProvider;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.ehansoo94.planner.member.Member;

@Service
public class DailyBoardDAO {

	@Autowired
	private SqlSession ss;
	
	public void clearDate(HttpServletRequest req) {
		req.getSession().setAttribute("viewDate", null);
	}
	
	public void getDailyBoard(HttpServletRequest req) {
		try {
			DailyBoardMapper dailyMapper = ss.getMapper(DailyBoardMapper.class);
			
			Date viewDate = (Date) req.getSession().getAttribute("viewDate");
			if(viewDate == null) {
				viewDate = new Date();
			}
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			String viewDateString = dateFormat.format(viewDate);
		
			Member m = (Member) req.getSession().getAttribute("loginMember");
			String userID = m.getM_id();
			String d_userID_and_date = userID + viewDateString;
		
			
			DailyBoard viewDailyBoard = dailyMapper.getDailyBoard(d_userID_and_date);
			
			req.setAttribute("viewDailyBoard", viewDailyBoard);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void createDailyBoard(HttpServletRequest req) {
		try {
			DailyBoardMapper dailyMapper = ss.getMapper(DailyBoardMapper.class);
			
			Member m = (Member) req.getSession().getAttribute("loginMember");
			String userID = m.getM_id();
			
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			Date dateToCreate = (Date) req.getSession().getAttribute("viewDate");
			String dateString = dateFormat.format(dateToCreate); 
			
			String d_userID_and_date = userID + dateString;
			System.out.println("테이블명" + d_userID_and_date);
			
			if(dailyMapper.getDailyBoard(d_userID_and_date) == null) {
				dailyMapper.createDailyBoard(d_userID_and_date);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertSchedule(HttpServletRequest req) {
		try {
			DailyBoardMapper dailyMapper = ss.getMapper(DailyBoardMapper.class);
			
			String scheduleText = (String) req.getAttribute("scheduleText");
			dailyMapper.insertSchedule(scheduleText);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertTodoList(HttpServletRequest req, String TodoList) {
		try {
			DailyBoardMapper dailyMapper = ss.getMapper(DailyBoardMapper.class);
			dailyMapper.insertTodoList(TodoList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertReview(HttpServletRequest req, String Review) {
		try {
			DailyBoardMapper dailyMapper = ss.getMapper(DailyBoardMapper.class);
			dailyMapper.insertReview(Review);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
