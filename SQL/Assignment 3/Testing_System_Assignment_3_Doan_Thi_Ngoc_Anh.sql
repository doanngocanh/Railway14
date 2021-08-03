use `Testing System`;

# Insert rows into table

insert into Department(DepartmentName)
values
	(N'Marketing'),
    (N'Sale'),
	(N'Bảo vệ'),
    (N'Nhân sự'),
    (N'Kỹ thuật'),
    (N'Tài chính'),
    (N'Phó giám đốc'),
    (N'Giám đốc'),
    (N'Thư ký'),
    (N'Bán hàng');

insert into `Position`(PositionName)
values
	(N'Admin'),
	(N'PM'),
	(N'DL'),
	(N'Tester'),
	(N'BE Dev'),
	(N'SA'),
	(N'Tech Lead'),
	(N'Intern'),
	(N'BA'),
	(N'FE Dev');

insert into `Account`(Email, Username, Fullname, DepartmentID, PositionID, CreateDate)
values
	('aaa@gmail.com', 'aaa', N'Nguyễn Văn A', 1, 1, '2020-09-01'),
	('bbb@gmail.com', 'bbb', N'Nguyễn Văn B', 2, 2, '2020-09-02'),
	('ccc@gmail.com', 'ccc', N'Nguyễn Văn C', 3, 3, '2020-09-03'),
	('ddd@gmail.com', 'ddd', N'Nguyễn Văn D', 4, 4, '2020-09-04'),
	('eee@gmail.com', 'eee', N'Nguyễn Văn E', 5, 5, '2020-09-05'),
	('fff@gmail.com', 'fff', N'Nguyễn Văn F', 6, 6, '2020-09-06'),
	('ggg@gmail.com', 'ggg', N'Nguyễn Văn G', 7, 7, '2020-09-07'),
	('hhh@gmail.com', 'hhh', N'Nguyễn Văn H', 8, 8, '2020-09-08'),
	('iii@gmail.com', 'iii', N'Nguyễn Văn I', 9, 9, '2020-09-09'),
	('jjj@gmail.com', 'jjj', N'Nguyễn Văn J', 10, 10, '2020-09-10'),
    ('aaaaa@gmail.com', 'aaaaa', N'Nguyễn Văn AAA', 1, 1, '2020-09-11');

insert into `Group`(GroupName, CreatorID, CreateDate)
values
	('AAA', 3, '2020-10-01'),
	('BBB', 3, '2020-10-02'),
	('CCC', 3, '2020-10-03'),
	('DDD', 3, '2020-10-04'),
	('EEE', 3, '2020-10-05'),
	('FFF', 2, '2020-10-06'),
	('GGG', 2, '2020-10-07'),
	('HHH', 2, '2020-10-08'),
	('III', 2, '2020-10-09'),
	('JJJ', 2, '2020-10-10');
    
insert into GroupAccount(GroupID, AccountID, JoinDate)
values
	(1, 1, '2020-11-01'),
	(2, 2, '2020-11-02'),
	(3, 3, '2020-11-03'),
	(4, 4, '2020-11-04'),
	(5, 5, '2020-11-05'),
	(6, 6, '2020-11-06'),
	(7, 7, '2020-11-07'),
	(8, 8, '2020-11-08'),
	(9, 9, '2020-11-09'),
	(10, 10, '2020-11-10');

insert into TypeQuestion(TypeName)
values
	(N'A'),
	(N'B'),
	(N'C'),
	(N'D'),
	(N'E'),
	(N'F'),
	(N'G'),
	(N'H'),
	(N'I'),
	(N'J');

insert into CategoryQuestion(CategoryName)
values
	(N'Category A'),
	(N'Category B'),
	(N'Category C'),
	(N'Category D'),
	(N'Category E'),
	(N'Category F'),
	(N'Category G'),
	(N'Category H'),
	(N'Category I'),
	(N'Category J');
    
insert into Question(Content, CategoryID, TypeID, CreatorID, CreateDate)
values
	('Question content A', 1, 1, 1, '2020-12-01'),
	('Question content B', 2, 2, 2, '2020-12-02'),
	('Question content C', 3, 3, 3, '2020-12-03'),
	('Question content D', 4, 4, 4, '2020-12-04'),
	('Question content E', 5, 5, 5, '2020-12-05'),
	('Question content F', 6, 6, 6, '2020-12-06'),
	('Question content G', 7, 7, 7, '2020-12-07'),
	('Question content H', 8, 8, 8, '2020-12-08'),
	('Question content I', 9, 9, 9, '2020-12-09'),
	('Question content J', 10, 10, 10, '2020-12-10');
    
insert into Answer(Content, QuestionID, isCorrect)
values
	('Answer content A', 1, true),
	('Answer content B', 2, false),
	('Answer content C', 3, true),
	('Answer content D', 4, false),
	('Answer content E', 5, true),
	('Answer content F', 6, false),
	('Answer content G', 7, true),
	('Answer content H', 8, false),
	('Answer content I', 9, true),
	('Answer content J', 10, false);
    
insert into Exam(`Code`, Title, CategoryID, Duration, CreatorID, CreateDate)
values
	('001', 'Title A', 1, '01:30:00', 1, '2020-12-11'),
	('002', 'Title B', 2, '01:30:00', 2, '2020-12-12'),
	('003', 'Title C', 3, '01:30:00', 3, '2020-12-13'),
	('004', 'Title D', 4, '01:30:00', 4, '2020-12-14'),
	('005', 'Title E', 5, '01:30:00', 5, '2020-12-15'),
	('006', 'Title F', 6, '01:30:00', 6, '2020-12-16'),
	('007', 'Title G', 7, '01:30:00', 7, '2020-12-17'),
	('008', 'Title H', 8, '01:30:00', 8, '2020-12-18'),
	('009', 'Title I', 9, '01:30:00', 9, '2020-12-19'),
	('010', 'Title J', 10, '01:30:00', 10, '2020-12-20');

insert into ExamQuestion(ExamID, QuestionID)
values
	(1, 1),
	(2, 2),
	(3, 3),
	(4, 4),
	(5, 5),
	(6, 6),
	(7, 7),
	(8, 8),
	(9, 9),
	(10, 10);

# Config SQL update mode

set SQL_SAFE_UPDATES = 0;

# SQL queries

select * from Department;

select Department.DepartmentID from Department
where Department.DepartmentName = N'Sale';

select * from `Account`
order by length(`Account`.Fullname) desc
limit 1;

select * from `Account`
where `Account`.DepartmentID = 3
order by length(`Account`.Fullname) desc
limit 1;

select `Group`.GroupName from `Group`
where `Group`.CreateDate < '2019-12-20';

select Y.QuestionID
from
	(select X.QuestionID, count(X.AnswerID) 'count'
    from
		(select question.QuestionID, answer.AnswerID
		from question, answer
        where question.QuestionID = answer.QuestionID) X
	group by X.QuestionID) Y
where Y.count >= 4;

select exam.ExamID from exam
where exam.Duration >= '01:00:00' and exam.CreateDate < '2019-12-20';

select * from `Group`
order by `Group`.CreateDate desc
limit 5;

select count(`Account`.AccountID) 'count' from `Account`
where `Account`.DepartmentID = 2;

select * from `Account`
where `Account`.Fullname like 'D%o';

delete from Exam
where Exam.CreateDate < '2019-12-20';

delete from Question
where Question.Content like N'câu hỏi%';

update `Account`
set `Account`.Fullname = N'Nguyễn Bá Lộc', `Account`.Email = 'loc.nguyenba@vti.com.vn'
where `Account`.AccountID = 5;

update `Account`
set `Account`.Fullname = N'Nguyễn Bá Lộc', `Account`.Email = 'loc.nguyenba@vti.com.vn'
where `Account`.AccountID = 5;

insert into GroupAccount(GroupID, AccountID, JoinDate)
value (4, 5, '2020-12-31');