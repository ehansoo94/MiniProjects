package com.ehansoo94.planner.dailyboard;

import java.util.Date;

public class DailyBoard {
	
	private String user;
	private Date d_date;
	private String d_to_do_list;
	private String d_scedule;
	private String d_review;
	
	public DailyBoard() {
		// TODO Auto-generated constructor stub
	}

	public DailyBoard(String user, Date d_date, String d_to_do_list, String d_scedule, String d_review) {
		super();
		this.user = user;
		this.d_date = d_date;
		this.d_to_do_list = d_to_do_list;
		this.d_scedule = d_scedule;
		this.d_review = d_review;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getD_date() {
		return d_date;
	}

	public void setD_date(Date d_date) {
		this.d_date = d_date;
	}

	public String getD_to_do_list() {
		return d_to_do_list;
	}

	public void setD_to_do_list(String d_to_do_list) {
		this.d_to_do_list = d_to_do_list;
	}

	public String getD_scedule() {
		return d_scedule;
	}

	public void setD_scedule(String d_scedule) {
		this.d_scedule = d_scedule;
	}

	public String getD_review() {
		return d_review;
	}

	public void setD_review(String d_review) {
		this.d_review = d_review;
	}
	
	
	

	
}
