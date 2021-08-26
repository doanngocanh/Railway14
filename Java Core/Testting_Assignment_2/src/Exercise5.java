import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner nhapSoNguyen = new java.util.Scanner(System.in);
		System.out.println("Mời bạn nhập 3 số nguyên:");
		int x = nhapSoNguyen.nextInt();
		nhapSoNguyen.nextLine();
		int y = nhapSoNguyen.nextInt();
		nhapSoNguyen.nextLine();
		int z = nhapSoNguyen.nextInt();
		
		
		
		System.out.println("số vừa nhập là: " + x + "," + y+ "," + z);
	}

}
