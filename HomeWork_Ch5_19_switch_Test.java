package tw.larry.myproject.homeWork;

import java.util.Scanner;

public class HomeWork_Ch5_19_switch_Test {

	public static void main(String[] args) {
		int day;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("請輸入星期:");
		day = scn.nextInt();
		System.out.println("Day "+day);
		switch(day){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Work Day!!!");
				break;
			case 6:
			case 7:
				System.out.println("Holiday!!!");
				break;
			default:
				System.out.println("輸入錯誤啦!");
				break;
		}

	}

}
