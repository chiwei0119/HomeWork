package tw.larry.myproject.homeWork;

public class HomeWork_Ch5_DoWhileTest {

	public static void main(String[] args) {
		int i = 1, j = 1;
		do {
			do {

				System.out.print(j + " * " + i + " = " + i * j + "\t");
				i++;
			} while (i <= 9);
			System.out.println();
			i = 1;
			j++;
		} while (j <= 9);

	}

}
