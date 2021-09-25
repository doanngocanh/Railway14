package com.anhdoanthingoc.finalexam.utils;
import java.util.Scanner;

public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);

	public static int scInt() {

		int ketQua = 0;
		boolean stop = false;
		do {
		try {
			ketQua = Integer.parseInt(scanner.next())  ;
			scanner.nextLine();
			stop = true;
			
		} catch (Exception e) {
			System.out.println("Nhập sai, vui lòng nhập lại");
		}
		} while (!stop);
		return ketQua;

	}
	
	public static String scString() {
		return scanner.nextLine();
		

		

	}
}
