package com.ehansoo94.planner.dailyboard;

public interface DailyBoardMapper {
	public abstract int createDailyBoard(String m_id);
	public abstract int insertTodoList(DailyBoard dBoard);
	public abstract int insertSchedule(DailyBoard dBoard);
	public abstract int insertReview(DailyBoard dBoard);
}
