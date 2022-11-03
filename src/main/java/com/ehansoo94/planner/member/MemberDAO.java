package com.ehansoo94.planner.member;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberDAO {
	
	@Autowired
	private SqlSession ss;
	
	public void signup(Member m, HttpServletRequest req) {
		try {
			
			MemberMapper mm = ss.getMapper(MemberMapper.class);
			
			if (mm.signup(m) == 1) {
				req.setAttribute("result", "회원가입이 정상 처리되었습니다^^");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "회원가입 실패하였습니다.");
		}
	}

	public void login(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			MemberMapper mm = ss.getMapper(MemberMapper.class);
			
			String input_id = req.getParameter("input_id");
			String m_pw = mm.getMember(input_id).getM_pw();
			
			if(mm.getMember(input_id) != null) {
				String input_pw = req.getParameter("input_pw");
				if (input_pw.equals(m_pw)) {
					Member m = mm.getMember(input_id);
					req.getSession().setAttribute("loginMember", m);
					req.getSession().setMaxInactiveInterval(600);
					
					// 로그인 시 오늘의 할 일을 바로 보여주기 위해 오늘 날짜를 설정.
					Date viewDate = new Date();
					req.getSession().setAttribute("viewDate", viewDate);
					
					Cookie cookie = new Cookie("lastLoginId", input_id);
					cookie.setMaxAge(60 * 60 * 7);
					res.addCookie(cookie);
				} else {
					req.setAttribute("result", "비밀번호가 일치하지 않습니다.");
				}
			} else {
				req.setAttribute("result", "가입되지 않은 id 입니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("result", "서버에 오류가 있어서 로그인할 수 없습니다.");
		}
	}
	
	public static boolean loginCheck(HttpServletRequest req) {
		Member m = (Member) req.getSession().getAttribute("loginMember");
		if (m != null) {
			// 로그인에 성공했거나 이미 로그인 상태임
			return true;
		}
		return false;
	}
	
	public static void logout(HttpServletRequest req) {
		req.getSession().setAttribute("loginMember", null);
		req.setAttribute("result", "로그아웃 하였습니다^^");
	}
	
	
	
}
