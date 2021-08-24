import java.time.Instant;
import java.util.Date;
import java.util.Locale.Category;
import java.util.Timer;

public class Program {
	public static void main(String[] args) {
//		Tạo 3 đối tượng Position
		Position pm = new Position(2, PositionName.PM);
		Position test = new Position(3, PositionName.TEST);
		Position po = new Position(1, PositionName.SCRUMMASTER);

//		 Tạo 3 đối tượng Department
		Department phongDev = new Department(1, "phongDev");
		Department phongHanhChinh = new Department(2, "phongHanhChinh");
		Department phongTongHop = new Department(3, "phong Tong Hop");

//		Tạo 3 đối tượng account
		Account account1 = new Account(1, "doanngocanh@gmail.com", "doanngocanh", "doanngocanh", po, phongTongHop,
				Date.from(Instant.now()));
		Account account2 = new Account(2, "doanngocanh1@gmail.com", "doanngocanh1", "doanngocanh1", po, phongTongHop,
				Date.from(Instant.now()));
		Account account3 = new Account(3, "doanngocanh2@gmail.com", "doanngocanh2", "doanngocanh2", pm, phongHanhChinh,
				new Date(2021 / 01 / 01));
		
//		Tạo 3 đối tượng Group
		Group group1 = new Group(1, "nhóm Dev", 1, new Date(2021/01/01));
		Group group2 = new Group(2, "nhóm Test", 2, new Date(2021/01/01));
		Group group3 = new Group(3, "nhóm PM", 3, new Date(2021/01/01));
		
//		Tạo 3 dối tượng GroupAccount
		GroupAccount groupAccount1 = new GroupAccount(group1, account1, new Date(2021/01/01));
		GroupAccount groupAccount2 = new GroupAccount(group2, account2, new Date(2021/01/01));
		GroupAccount groupAccount3 = new GroupAccount(group3, account3, new Date(2021/01/01));
		
//		Tạo 3 đối tượng TypeQuestion 
		TypeQuestion typeQuestion1 = new TypeQuestion(1, "Essay");
		TypeQuestion typeQuestion2 = new TypeQuestion(2, "Multiple-Choice");
		TypeQuestion typeQuestion3 = new TypeQuestion(3, "Multiple-Choice & Essay");
		
//		Tạo 3 đối tượng CategoryQuestion 
		CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, "Java");
		CategoryQuestion categoryQuestion2 = new CategoryQuestion(1, "SQL");
		CategoryQuestion categoryQuestion3 = new CategoryQuestion(1, "Ruby");
		
//		Tạo  3 đối tượng Exam
		Exam exam1 = new Exam(1, "A01", "Đề thi Văn", categoryQuestion1, 10, 1, new Date(2021/01/01));
		Exam exam2 = new Exam(2, "A02", "Đề thi Toán", categoryQuestion2, 10, 1, new Date(2021/01/01));
		Exam exam3 = new Exam(3, "A03", "Đề thi Anh", categoryQuestion2, 10, 1, new Date(2021/01/01));
		
//		Tạo 3 đối tượng Question 
		Question question1 = new Question(1, "Question về nội dung A", categoryQuestion1, typeQuestion1, 1, new Date(2021/01/01));
		Question question2 = new Question(2, "Question về nội dung B", categoryQuestion2, typeQuestion2, 2, new Date(2021/01/01));
		Question question3 = new Question(1, "Question về nội dung A", categoryQuestion3, typeQuestion3, 3, new Date(2021/01/01));
		
		Exam[] exams1 = {exam1, exam2};
		Exam[] exams2 = {exam3, exam2};
		Question[] questions1 = {question1, question2};
		Question[] questions2 = {question3, question2};
		
		
		
		exam1.setQuestions(questions1);
		exam2.setQuestions(questions2);
		exam3.setQuestions(questions1);
		
		question1.setExams(exams2);
		question2.setExams(exams1);
		question3.setExams(exams2);
		
//		Tạo 3 đối tượng Answer
		Answer answer1 = new Answer(1, "Câu trả lời A", question1, false);
		Answer answer2 = new Answer(2, "Câu trả lời B", question2, true);
		Answer answer3 = new Answer(3, "Câu trả lời C", question3, true);
		
		

	

		System.out.println(po.getId());
		System.out.println(po.getPositionName());
		System.out.println(account1);
		System.out.println(answer3);

	}
}