use `Testing System`;

alter table `Account`
add foreign key (DepartmentID) references Department(DepartmentID);

alter table `Account`
add foreign key (PositionID) references `Position`(PositionID);

alter table `Group`
add foreign key (CreatorID) references `Account`(AccountID);

alter table GroupAccount
add foreign key (GroupID) references `Group`(GroupID),
add foreign key (AccountID) references `Account`(AccountID);

alter table Question
add foreign key (CategoryID) references CategoryQuestion(CategoryID),
add foreign key (TypeID) references Typequestion(TypeID);

alter table Answer
add foreign key (QuestionID) references Question(QuestionID);

alter table Exam
add foreign key (CategoryID) references CategoryQuestion(CategoryID);

alter table ExamQuestion
add foreign key (ExamID) references Exam(ExamID),
add foreign key (QuestionID) references Question(QuestionID);