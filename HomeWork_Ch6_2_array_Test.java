package tw.larry.myproject.homeWork;

public class HomeWork_Ch6_2_array_Test {

	public static void main(String[] args) {
		int a[] = { 18, -51, 23, 35, 10, 9, -3, 52, 81, 69 };
		int b[] = { 28, 32, -35, 40, 73, 17, 92, 32, 13, 29 };
		int sum = 0, n, i;
		
		System.out.println("Array A 內容:");
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		System.out.println("\nArray B 內容:");
		for (i = 0; i < a.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();

		for (n = 0; n <= 9; n++) {
			sum += a[n] * b[9 - n];
		}
		System.out.println("Sum = " + sum);
	}

}
