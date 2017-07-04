package tw.larry.myproject.homeWork;

import java.util.Scanner;

public class HomeWork_Ch5_16_Test {

	public static void main(String[] args) {
		int input = 0, count = 0;
		int password = 1234;

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("Please Enter you PassWord:");
			input = scn.nextInt();
			count++;
			if (input == password) {
				System.out.println("密碼正確,歡迎使用本系統!");
				break;
			}
			if (count >= 3) {
				System.out.println("密碼輸入超過三次!!");
				break;
			}

		}
				
	}

}
