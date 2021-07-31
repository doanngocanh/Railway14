create database if not exists Testing_System_Assignment_1;
use Testing_System_Assignment_1;

create table if not exists Department (
DepartmentID int auto_increment,
DepartmentName varchar(100),

primary key (DepartmentID)
);

create table if not exists Position ( 
PositionID int auto_increment, 
PositionName varchar(100),

primary key (PositionID)
);

create table if not exists `Account` (
AccountID int auto_increment, 
Email varchar(50),
Username varchar(50), 
Fullname varchar(100),
DepartmentID int, 
PositionID int, 
CreateDate date,

primary key (AccountID)
);

create table if not exists `Group` (
GroupID int auto_increment,
GroupName varchar(100),
CreatorID int, 
CreateDate date,

primary key (GroupID)
);

create table if not exists GroupAccount (
GroupID int, 
AccountID int, 
JoinDate date,

primary key (GroupID, AccountID)
);

create table if not exists TypeQuestion ( 
TypeID int auto_increment,
TypeName varchar(100),

primary key (TypeID)
);

create table if not exists CategoryQuestion (
CategoryID int auto_increment,
CategoryName varchar(100),

primary key (CategoryID)
);

create table if not exists Question (
QuestionID int auto_increment,
Content varchar(200),
CategoryID int, 
TypeID int, 
CreatorID int, 
CreateDate date,

primary key (QuestionID)
);

create table if not exists Answer (
AnswerID int auto_increment,
Content varchar(200),
QuestionID int, 
isCorrect boolean,

primary key (AnswerID)
); 

create table if not exists Exam (
ExamID int auto_increment,
`Code` varchar(20), 
Title varchar(100),
CategoryID int, 
Duration time,
CreatorID int, 
CreateDate date,

primary key (ExamID)
);

create table if not exists ExamQuestion (
ExamID int, 
QuestionID int,

primary key (ExamID, QuestionID)
); 


