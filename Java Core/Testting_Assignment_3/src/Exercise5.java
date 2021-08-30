
public class Exercise5 {
	public static void main(String[] args) {
		Exercise5 questionNo = new Exercise5();
		questionNo.Question5();
	}

	Department department1 = new Department(1, "Phòng A");
	Department department2 = new Department(2, "Phòng B");
	Department department3 = new Department(2, "Phòng C");
	Department department4 = new Department(2, "Phòng D");
	Department department5 = new Department(2, "Phòng E");

	Account account1 = new Account(1, null, null, null, null, department2, null, null, 0);
	Account account2 = new Account(2, null, null, null, null, department3, null, null, 2);

	public void Question1() {
		System.out.println(account1.toString());
	}

	public void Question2() {
		Department[] departments = { department1, department2 };
		for (Department department : departments) {
			System.out.println(department.toString());

		}
	}

	public void Question5() {
		if (account1.compareTo(account2) == 1) {
			System.out.println("bằng nhau");
		} else {
			System.out.println("không bằng nhau");
		}

	}

}
