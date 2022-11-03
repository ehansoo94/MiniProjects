package com.ehansoo94.planner.dailyboard;

import java.util.Date;

public class DailyBoard {
	
	private String d_userID_and_date;
	private String d_to_do_list;
	private String d_schedule;
	private String d_review;
	
	public DailyBoard() {
		// TODO Auto-generated constructor stub
	}

	
	public DailyBoard(String d_userID_and_date, String d_to_do_list, String d_schedule, String d_review) {
		super();
		this.d_userID_and_date = d_userID_and_date;
		this.d_to_do_list = d_to_do_list;
		this.d_schedule = d_schedule;
		this.d_review = d_review;
	}


	public String getD_userID_and_date() {
		return d_userID_and_date;
	}

	public void setD_userID_and_date(String d_userID_and_date) {
		this.d_userID_and_date = d_userID_and_date;
	}

	public String getD_to_do_list() {
		return d_to_do_list;
	}

	public void setD_to_do_list(String d_to_do_list) {
		this.d_to_do_list = d_to_do_list;
	}

	public String getD_schedule() {
		return d_schedule;
	}

	public void setD_schedule(String d_schedule) {
		this.d_schedule = d_schedule;
	}

	public String getD_review() {
		return d_review;
	}

	public void setD_review(String d_review) {
		this.d_review = d_review;
	}
	
	
	

	
}
