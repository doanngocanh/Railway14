import java.time.Instant;
import java.util.Date;

public class Exercise1 {
	public static void main(String[] args) {
//		Tạo 3 đối tượng Position
		Position pm = new Position(2, PositionName.PM);
		Position test = new Position(3, PositionName.TEST);
		Position po = new Position(1, PositionName.SCRUMMASTER);

//		 Tạo 3 đối tượng Department
		Department phongDev = new Department(1, "phongDev");
		Department phongHanhChinh = new Department(2, "phongHanhChinh");
		Department phongTongHop = new Department(3, "phong Tong Hop");

//		Tạo 3 đối tượng Group
		Group group1 = new Group(1, "nhóm Dev", 1, new Date(2021 / 01 / 01));
		Group group2 = new Group(2, "nhóm Test", 2, new Date(2021 / 01 / 01));
		Group group3 = new Group(3, "nhóm PM", 3, new Date(2021 / 01 / 01));

//		Tạo 3 đối tượng account
		Account account1 = new Account(1, "doanngocanh@gmail.com", "doanngocanh", "doanngocanh", po, phongTongHop,
				Date.from(Instant.now()));
		Group[] GroupAcc1 = { group1, group2, group3 };
		account1.setGroups(GroupAcc1);

		Account account2 = new Account(2, "doanngocanh1@gmail.com", "doanngocanh1", "doanngocanh1", po, phongTongHop,
				Date.from(Instant.now()));
		Group[] GroupAcc2 = { group2, group3 };
		account2.setGroups(GroupAcc1);

		Account account3 = new Account(3, "doanngocanh2@gmail.com", "doanngocanh2", "doanngocanh2", pm, phongHanhChinh,
				new Date(2021 / 01 / 01));
		Group[] GroupAcc3 = { group2, group3 };
		account3.setGroups(GroupAcc1);

		Account[] accGroup1 = { account1, account2, account3 };
		Account[] accGroup2 = { account1, account2 };
		Account[] accGroup3 = { account3, account2 };

		group1.setAccounts(accGroup1);
		group2.setAccounts(accGroup2);
		group3.setAccounts(accGroup3);

//		Tạo 3 dối tượng GroupAccount
		GroupAccount groupAccount1 = new GroupAccount(group1, account1, new Date(2021 / 01 / 01));
		GroupAccount groupAccount2 = new GroupAccount(group2, account2, new Date(2021 / 01 / 01));
		GroupAccount groupAccount3 = new GroupAccount(group3, account3, new Date(2021 / 01 / 01));

//		Tạo 3 đối tượng TypeQuestion 
		TypeQuestion typeQuestion1 = new TypeQuestion(1, "Essay");
		TypeQuestion typeQuestion2 = new TypeQuestion(2, "Multiple-Choice");
		TypeQuestion typeQuestion3 = new TypeQuestion(3, "Multiple-Choice & Essay");

//		Tạo 3 đối tượng CategoryQuestion 
		CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, "Java");
		CategoryQuestion categoryQuestion2 = new CategoryQuestion(1, "SQL");
		CategoryQuestion categoryQuestion3 = new CategoryQuestion(1, "Ruby");

//		Tạo  3 đối tượng Exam
		Exam exam1 = new Exam(1, "A01", "Đề thi Văn", categoryQuestion1, 10, 1, new Date(2021 / 01 / 01));
		Exam exam2 = new Exam(2, "A02", "Đề thi Toán", categoryQuestion2, 10, 1, new Date(2021 / 01 / 01));
		Exam exam3 = new Exam(3, "A03", "Đề thi Anh", categoryQuestion2, 10, 1, new Date(2021 / 01 / 01));

//		Tạo 3 đối tượng Question 
		Question question1 = new Question(1, "Question về nội dung A", categoryQuestion1, typeQuestion1, 1,
				new Date(2021 / 01 / 01));
		Question question2 = new Question(2, "Question về nội dung B", categoryQuestion2, typeQuestion2, 2,
				new Date(2021 / 01 / 01));
		Question question3 = new Question(1, "Question về nội dung A", categoryQuestion3, typeQuestion3, 3,
				new Date(2021 / 01 / 01));

		Exam[] exams1 = { exam1, exam2 };
		Exam[] exams2 = { exam3, exam2 };
		Question[] questions1 = { question1, question2 };
		Question[] questions2 = { question3, question2 };

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

//		System.out.println(po.getId());
//		System.out.println(po.getPositionName());
//		System.out.println(account1);
//		System.out.println(answer3);

//		Question 1:
		System.out.println("=========================Question 1=====================");

		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + account2.department.nameDepartment);
		}
		;

//		Question 2:
		System.out.println("=========================Question 2=====================");

		int soluonggroup = account2.groups.length;
		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");

		} else if (soluonggroup <= 2) {
			System.out.println("Group của nhân viên này là Java Fresher , C#Freshser");
		} else if (soluonggroup == 3) {
			System.out.println("Nhân viên này là người quan trọng tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

//		Question 3:
		System.out.println("=========================Question 3=====================");

		System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là " + account2.department.nameDepartment);

//		Question 4: 
		System.out.println("=========================Question 4=====================");

		System.out.println(account1.positionId.positionName == PositionName.DEV ? "Đây là developer"
				: "Người này không phải là Developer");

//		Question 5:

		System.out.println("=========================Question 5=====================");
		int soLuongAccount = group1.accounts.length;
		switch (soLuongAccount) {
		case 1:
			System.out.println("Nhóm có 1 thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}

//		Question 6:
		System.out.println("=========================Question 6=====================");

		int soLuongGroup = account2.groups.length;
		switch (soLuongGroup) {
		case 1:
			System.out.println("Group của nhân viên này là Java Fresher , C#Freshser");
			break;
		case 2:
			System.out.println("Group của nhân viên này là Java Fresher , C#Freshser");
			break;
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}

//		Question 7:
		System.out.println("=========================Question 7=====================");

		String positionAccount1 = account1.positionId.positionName.toString();
		switch (positionAccount1) {
		case "DEV":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
//		Question 8:
		System.out.println("=========================Question 8=====================");

		Account[] accInfo = { account1, account2, account3 };
		int index = 0;
		for (Account accountInfo : accInfo) {
			System.out.println("index " + index + ":" + accountInfo.email + " " + accountInfo.fullName + " "
					+ accountInfo.positionId.positionName);
			index++;
		}

//		Question 9:
		System.out.println("=========================Question 9=====================");

		Department[] departmentInfo = { phongDev, phongHanhChinh, phongTongHop };
		for (Department departmentInfoo : departmentInfo) {
			System.out.println("id: " + departmentInfoo.idDepartment + "," + "Tên: " + departmentInfoo.nameDepartment);

		}

//		Question 10:
		System.out.println("=========================Question 10=====================");

		for (int i = 0; i < accInfo.length; i++) {
			System.out.println("\n" + "Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accInfo[i].email);
			System.out.println("Full name: " + accInfo[i].fullName);
			System.out.println("Phòng ban: " + accInfo[i].department.nameDepartment);

		}

//		Question 11:
		System.out.println("=========================Question 11=====================");

		for (int i = 0; i < departmentInfo.length; i++) {
			System.out.println("\n" + "Thông tin department thứ " + (i + 1) + "là: ");
			System.out.println("\t" + "Id: " + departmentInfo[i].idDepartment);
			System.out.println("\t" + "Name: " + departmentInfo[i].nameDepartment);
		}

//		Question 12
		System.out.println("=========================Question 12=====================");

		for (int i = 0; i < 2; i++) {
			System.out.println("\n" + "Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("Email: " + departmentInfo[i].idDepartment);
			System.out.println("Full name: " + departmentInfo[i].nameDepartment);
		}

//		Question 13
		System.out.println("=========================Question 13=====================");

		for (int i = 0; i < accInfo.length; i++) {
			if (i != 1) {
				System.out.println("index " + i + ": " + accInfo[i]);
			}

		}

//		Question 14
		System.out.println("=========================Question 14=====================");

		for (int i = 0; i < accInfo.length; i++) {
			if (accInfo[i].id < 4) {
				System.out.println("\n" + i + ": ");
				System.out.println("Email: " + accInfo[i].email);
				System.out.println("FullName: " + accInfo[i].fullName);
				System.out.println("Id: " + accInfo[i].id);
				System.out.println("UserNam: " + accInfo[i].userName);
				System.out.println("CreateDate: " + accInfo[i].createDate);
				System.out.println("Department Name: " + accInfo[i].department.nameDepartment);
				System.out.println("Position ID: " + accInfo[i].positionId);

			}

		}

//		Question 15:
		System.out.println("=========================Question 15=====================");
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}

		}
//		Question 16:
		System.out.println("=========================Question 16=====================");
//		Question 17:
		
		System.out.println("=========================Question 17=====================");
		
		
	}
}