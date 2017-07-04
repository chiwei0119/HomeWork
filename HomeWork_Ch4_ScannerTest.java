package tw.larry.myproject.homeWork;

import java.util.Scanner;

public class HomeWork_Ch4_ScannerTest {

	
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	int length = 0, width = 0, area;
	
	System.out.println("Input Length:");
	length = reader.nextInt();
	
	
	System.out.println("Input Width:");
	width = reader.nextInt();
	reader.close();
	
	area = length*width;
	
	System.out.println("Area:" + area );
	
	}

}
