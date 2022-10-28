
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
delete from MiniProject_01_Planner_Member where m_pw = null;
delete from MiniProject_01_Planner_Member where m_id = 'test3';
// 왜인지 모르겠는데 m_pw 로 지정한 것은 지워지지 않음..
// 아무튼 not null 제약조건이 성공적으로 부여된 것을 확인함!