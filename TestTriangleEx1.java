package tw.larry.myproject.homeWork;

public class TestTriangleEx1 {
	public void showTriangleUp() {
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 11 - i; j++) {
				System.out.print(" ");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print("*");
			}
			if (i == 1) {
				System.out.println();
				continue;
			}

			for (int m = 1; m <= i - 1; m++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 11 - i; j++) {
				System.out.print(" ");
			}

			System.out.println();

		}
	}

	public void showTriangleUDown() {
		for (int i = 1; i <= 10; i++) {

			for (int m = 1; m <= i-1; m++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 10 - i; j++) {
				System.out.print("*");
			}

			for (int j = 1; j <= 11 - i; j++) {
				System.out.print("*");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print(" ");
			}

			System.out.println();

		}
	}

	public static void main(String[] args) {
		TestTriangleEx1 test1 = new TestTriangleEx1();
		test1.showTriangleUp();
		test1.showTriangleUDown();

	}

}
