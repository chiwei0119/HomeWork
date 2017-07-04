package tw.larry.myproject.homeWork;

import java.util.Scanner;

public class HomeWork_Ch5_20_switch_Test {

	public static void main(String[] args) {
		int month;

		Scanner scn = new Scanner(System.in);

		System.out.println("請輸入月份:");
		month = scn.nextInt();
		System.out.println(month+"月");
		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("1.2.12月是冬天唷");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("3~5月是春天唷");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("6~8月是夏天唷");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("9~11月是秋天唷");
			break;
			
		default:
			System.out.println("月份不存在");
			break;
		}

	}

}
