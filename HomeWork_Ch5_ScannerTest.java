package tw.larry.myproject.homeWork;

import java.util.Scanner;

public class HomeWork_Ch5_ScannerTest {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char ch;
		System.out.println("Please enter:");
		ch = reader.next().charAt(0);

		if (ch <= '9' && ch >= '0') {
			System.out.println("It's Number!!");
		} else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			System.out.println("It's English alphabet!!");
		} else {
			System.out.println("It's no what i want!!");
		}
	}

}
