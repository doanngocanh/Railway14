import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Exercise1 quesno = new Exercise1();
		quesno.Question4();
	}

	public Exercise1() {
	}

	// Question 1
	public void Question1() {

		Account account1 = new Account(1, null, null, null, null, null, null, null, 5240.5f);
		Account account2 = new Account(2, null, null, null, null, null, null, null, 10970.055f);

		int i = (int) account1.salary;
		int y = (int) account2.salary;
		System.out.println("Lương của account1 là: " + i + "$");
		System.out.println("Lương của account2 là: " + y + "$");

	}

	// Question 2
	public void Question2() {
		Random random = new Random();
		Integer number = random.nextInt(100000);

		switch (number.toString().length()) {
		case 5:
			System.out.println(number);
			break;
		case 4:
			System.out.println("0" + number);
			break;
		case 3:
			System.out.println("00" + number);
			break;
		case 2:
			System.out.println("000" + number);
			break;
		case 1:
			System.out.println("0000" + number);
			break;
		default:
			break;
		}
	}

//		Question 3: lấy 2 chữ số cuối
	public void Question3() {
		Random random = new Random();
		Integer number = random.nextInt(100000);

		int length = number.toString().length();
		String nbString = number.toString();

//		System.out.println(nbString.charAt(length-2) +""+ nbString.charAt(length-1));
//		System.out.println(nbString.substring(length-2));
		System.out.println(number % 100);

	}

//	Question 4
	public void Question4() {
		Scanner nhapSo = new Scanner(System.in);
		System.out.println("Nhập số nguyên thứ nhất: ");
		int a = nhapSo.nextInt();
		nhapSo.nextLine();
		System.out.println("Nhập số nguyên thứ hai: ");
		int b = nhapSo.nextInt();

		float x = (float) a / b;

		System.out.println(x);

	}
	

}
