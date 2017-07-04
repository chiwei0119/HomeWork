package tw.larry.myproject.homeWork;

public class HomeWork_Ch6_3_array_Test {

	public static void main(String[] args) {
		int A[] = { 53, 27, 69, 12, 3, 96 };
		int odd = 0, even = 0;
		int biggestOdd = 0, biggestEven = 0;

		System.out.println("A array內容:");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
			if (A[i] % 2 == 0) {
				even++;
				if (biggestEven <= A[i])
					biggestEven = A[i];
			} else {
				if (biggestOdd <= A[i])
					biggestOdd = A[i];
				odd++;
			}
		}
		
		System.out.println("\nA array 內Odd總數有" + odd);
		System.out.println("A array 內Even總數有" + even);
		
		System.out.println("Odd最大值為:" + biggestOdd);
		System.out.println("Even最大值為" + biggestEven);
	}

}
