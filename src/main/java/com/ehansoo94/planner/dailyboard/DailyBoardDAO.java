package com.ehansoo94.planner.dailyboard;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.ehansoo94.planner.member.Member;

@Service
public class DailyBoardDAO {

	@Autowired
	private SqlSession ss;
	
	public void createDailyBoard(HttpServletRequest req, Model model) {
		try {
			DailyBoardMapper dayMapper = ss.getMapper(DailyBoardMapper.class);
			Member m = (Member) req.getSession().getAttribute("loginMember");
			String id = m.getM_id();
			dayMapper.createDailyBoard(id);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
