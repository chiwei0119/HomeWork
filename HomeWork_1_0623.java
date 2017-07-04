package tw.larry.myproject.homeWork;

public class HomeWork_1_0623 {

	public static void main(String[] args) {
		int index = 2; // 1 is 攝氏 轉 華氏（f） , 2 is 華氏 轉 攝氏 
		float temperature =  (float)20.25;
		float temperature1;
		
		switch(index){
		case 1:
			temperature1 = (temperature*9/5)+32;
			System.out.println(temperature1 + " \u2109");
			break;
		case 2:
			temperature1 = (temperature-32)*5/9;
			System.out.println(temperature1 + " \u2103");
			break;
		default:
			System.out.println("Index is not Correct!!");
 		}

	}

}
