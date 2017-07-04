package tw.larry.myproject.homeWork;
/*
 * 找出小於45的所有質數 ,使用continue敘述
 */
public class HomeWork_Ch5_18_Test {

	public static void main(String[] args) {
		int i, j;
		int count = 0;
		int number = 45, flag = 0;
		System.out.println("質數:");
		while (flag != 1) {
			for (i = 1; i <= number; i++) {
				if (number % i == 0){
					count++;
				}
				
			}
			if(count == 2){
				System.out.println(number);
				number--;
				count = 0;
			}
			else {
				number--;
				count = 0;
				continue;
			}
			
			if(number == 1)flag = 1;
		}

	}

}
