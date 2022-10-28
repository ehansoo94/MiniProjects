package com.ehansoo94.planner.member;

public interface MemberMapper {
	public abstract int signup(Member m);
	public abstract Member getMember(String input_id);

}
