import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Exercise4 questionNo = new Exercise4();
		questionNo.Question9();
	}

	public void Question1() {

		Scanner xau1 = new Scanner(System.in);
		System.out.println("nhap chuoi");
		String x = xau1.nextLine();
		String[] aStrings = x.trim().split(" ");
		System.out.println(aStrings.length);
	}

	public void Question2() {
		String x = "nhap chuoi vao day";
		String y = x.charAt(0) + "";
		x = x.replaceFirst(y, y.toUpperCase());
		System.out.println(x);
	}

	public void Question3() {
		String input = "Ngoc Anh";
		for (int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));

		}
	}

	public void Question3nguoclai() {
		String input1 = "Ngoc Anh";
		for (int i = input1.length() - 1; i >= 0; i--) {
			System.out.println(input1.charAt(i));
		}
	}

	public void Question4() {
		Scanner nhapTen = new Scanner(System.in);
		System.out.println("Nhập tên:");
		String a = nhapTen.nextLine();
		String[] tens = a.trim().split("");
		for (int i = 0; i < tens.length; i++) {
			String x = tens[i];
			System.out.println(x);

		}

	}

	public void Question5() {
		Scanner ho = new Scanner(System.in);
		System.out.println("nhap ho");
		String x = ho.nextLine();
		System.out.println("nhap ten");
		String y = ho.nextLine();
		String a = x + " " + y;
//		System.out.println(a);
		String[] b = a.trim().split(" ");
		for (int i = 0; i < b.length; i++) {
			if (b[i] != "") {
				System.out.print(b[i] + " ");
			}
		}

	}

	public void Question6() {
		Scanner nhapHoTen = new Scanner(System.in);
		System.out.println("Nhập họ và tên:");
		String hoTen = nhapHoTen.nextLine();
		String[] hoTens = hoTen.trim().split(" ");
		for (int i = 0; i < hoTens.length; i++) {
			if (hoTens[i] != "") {
				if (i == 0) {
					System.out.println("Họ là: " + hoTens[i]);
				} else if (i < hoTens.length - 1) {
					System.out.println("Tên đệm là: " + hoTens[i]);
				} else {
					System.out.println("Tên là: " + hoTens[i]);
				}
			}

		}
	}

	public void Question7() {
		Scanner ho = new Scanner(System.in);
		System.out.println("nhap ho");
		String x = ho.nextLine();
		System.out.println("nhap ten");
		String y = ho.nextLine();

		String z = x.trim() + " " + y.trim();

		System.out.println("47: " + z);

		String[] hoTens = z.trim().split(" ");

		System.out.println(Arrays.toString(hoTens));

		for (int i = 0; i < hoTens.length; i++) {
			hoTens[i] = hoTens[i].trim();
			System.out.println(" index i = " + i + " => " + hoTens[i]);
			if (hoTens[i] != "") {
				// hoTens[0] = "doan"
				String ab = hoTens[i].charAt(0) + ""; // ab = "d"
				ab = ab.replaceFirst(ab, ab.toUpperCase()); // ab = "D"
				hoTens[i] = ab + hoTens[i].substring(1, hoTens[i].length());// hoTens[0] = "Doan"
			}
		}

		System.out.println(Arrays.toString(hoTens));

		z = "";
		for (String string : hoTens) {
			if (string != "") {
				z = z + string + " ";
			}

		}
		System.out.println("=>: " + z);

	}

	Group group1 = new Group(1, "Group Java Fresh", 1, Date.from(Instant.now()));
	Group group2 = new Group(2, "Group Java Junior", 2, Date.from(Instant.now()));
	Group group3 = new Group(3, "Group Java Senior", 3, Date.from(Instant.now()));
	Group group4 = new Group(4, "Group Master", 4, Date.from(Instant.now()));
	Group group5 = new Group(5, "Java", 5, Date.from(Instant.now()));
	Group group6 = new Group(6, "Java", 6, Date.from(Instant.now()));

	public void Question8() {

		String[] nhomGroup = { group1.nameGroup, group2.nameGroup, group3.nameGroup, group4.nameGroup, group5.nameGroup,
				group6.nameGroup };

		for (int i = 0; i < nhomGroup.length; i++) {
			if (nhomGroup[i].contains("Java")) {
				System.out.println(nhomGroup[i]);
			}
		}
	}

	public void Question9() {

		String[] nhomGroup = { group1.nameGroup, group2.nameGroup, group3.nameGroup, group4.nameGroup, group5.nameGroup,
				group6.nameGroup };

		for (int i = 0; i < nhomGroup.length; i++) {
			if (nhomGroup[i] == "Java") {
				System.out.println(nhomGroup[i]);
			}
		}

	}

}
