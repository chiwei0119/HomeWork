package tw.larry.myproject.homeWork;
/*
 * 隨機產生1～42數字共100000次, 記錄1～42 出現次數, 並且由大到小排列
 */
public class HomeWork_3_0628 {
	
	int[] data1 = new int[42];
	int[] data2 = new int[42];
	
	static int dataSize = 42;
	static int randomTimes = 100000;

	public void randomNumber(int randomTimes) {
		int tempNumber;
		for (int i = 0; i < randomTimes; i++) {
			tempNumber = (int) (Math.random() * 42 ) ;
			data1[tempNumber]++;
			// System.out.println("Random numebr:" + tempNumber);
		}
	}
	public void showData(String dataName){
		System.out.println(dataName);
		System.out.println("-----------------------");
		
		for (int j = 0; j < data1.length; j++) {
			System.out.printf("%d\t%d\n" ,j+1 , data1[j]);
		}
	}
	public void sortToDescendPower(){   //由大致小排列
		
	}
	public void sortToAscendPower(){    //由小至大
		
	}

	public static void main(String[] args) {
		HomeWork_3_0628 countRandomNumber = new HomeWork_3_0628();

		countRandomNumber.randomNumber(randomTimes);
		countRandomNumber.showData("Original Data");
		
		//countRandomNumber.sortToDescendPower();
		//countRandomNumber.showData("Sort Data");
		
		
	}

}
