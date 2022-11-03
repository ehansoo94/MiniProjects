
// 회원정보 테이블
create table Planner01_Member(
	m_id varchar2(10 char) primary key, 
	m_pw varchar2(12 char) not null
);

select * from Planner01_Member;
drop table Planner01_Member cascade constraint purge;

// 일정등록 테이블
create table Planner01_Dayboard(
	d_userID_and_date varchar2(18 char) primary key, 
	d_to_do_list varchar2(300 char),
	d_schedule varchar2(300 char),
	d_review varchar2(300 char)
)

drop table Planner01_Dayboard cascade constraint purge;
select * from Planner01_Dayboard;
delete from Planner01_Dayboard where d_userID_and_date = 'null20221103'; 
