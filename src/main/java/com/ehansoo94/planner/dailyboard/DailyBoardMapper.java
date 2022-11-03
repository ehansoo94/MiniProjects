package com.ehansoo94.planner.dailyboard;

public interface DailyBoardMapper {
	public abstract int createDailyBoard(String d_userID_and_date);
	public abstract int insertTodoList(String TodoList);
	public abstract int insertSchedule(String Schedule);
	public abstract int insertReview(String Review);
	public abstract DailyBoard getDailyBoard(String d_userID_and_date);
}
