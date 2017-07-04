package tw.larry.myproject.homeWork;

public class HomeWork_Ch5_BreakTest {

	public static void main(String[] args) {
		int length = 3500, day = 0;
		while(length>=3){
			length/=2;
			day++;
			if(length<3)break;
		}
		System.out.println("Day = " + day);
	}

}
