
// 회원정보 테이블
create table MiniProject_01_Planner_Member(
	m_id varchar2(10 char) primary key, 
	m_pw varchar2(12 char)
);

drop table MiniProject_01_Planner_Member cascade constraint purge;
select * from MiniProject_01_Planner_Member;

// 비밀번호에 not null 제약조건을 안 걸어서, 추가하기로 함.
alter table MiniProject_01_Planner_Member modify m_pw not null;

insert into MiniProject_01_Planner_Member values('test3', null);
delete from MiniProject_01_Planner_Member where m_pw = null; (이 코드는 아무 기능도 하지 못했다. 왜일까?? test3 을 지우지 못함.) 
delete from MiniProject_01_Planner_Member where m_id = 'test3'; (이렇게 하고나서야 지워졌다.)

// 아무튼 not null 제약조건이 성공적으로 부여된 것을 확인함!

// 일정등록 테이블
(회원가입시 자동으로 만들어지도록 해야 함.)
create table MiniProject_01_Planner_user1_dailyboard(
	d_date date primary key,
	d_to_do_list varchar2(200 char),
	d_schedule varchar2(300 char),
	d_review varchar2(300 char)
)

