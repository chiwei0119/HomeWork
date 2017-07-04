package tw.larry.myproject.homeWork;
/*
 * 隨機產生1～42數字共100000次, 記錄1～42 出現次數, 並且由大到小排列
 */
class HomeWork_3_628_classArray {

	public int arrayId = 0;
	public int countNumber = 0;
	static int dataSize = 42;
	static int randomTimes = 100000;

	HomeWork_3_628_classArray(int x) {
		arrayId = x;
	}

	static void randomNumber(HomeWork_3_628_classArray[] data) {
		for (int i = 0; i < randomTimes; i++) {
			data[(int) ((Math.random() * dataSize + 1) - 1)].countNumber++;

		}
	}

	static void showData(HomeWork_3_628_classArray[] data, String dataName) {
		System.out.println(dataName);
		System.out.println("-----------------------");
		for (int i = 0; i < dataSize; i++) {
			System.out.println(data[i].arrayId + " " + data[i].countNumber);
		}
	}

	static void sortToDescendPower(HomeWork_3_628_classArray[] data) { // 由大致小排列
		while (true) {

			int flag = 0;
			for (int j = 0; j < dataSize - 1; j++) {
				if (data[j].countNumber < data[j + 1].countNumber) {
					data[dataSize] = data[j];
					data[j] = data[j + 1];
					data[j + 1] = data[dataSize];
					flag++;
				}
			}
			if (flag == 0)break;
		}
	}

	public static void main(String[] args) {
		//建立一個HomeWork_3_628_classArray[] 類別的data物件 ,分配記憶體位置給(dataSize+1)個物件
		HomeWork_3_628_classArray[] data = new HomeWork_3_628_classArray[dataSize+1];
		for (int i = 0; i < data.length; i++) {
			data[i] = new HomeWork_3_628_classArray(i + 1);
		}
		randomNumber(data);
		showData(data, "Original Data");
		sortToDescendPower(data);
		showData(data, "Sort Data");
		// countRandomNumber.sortToDescendPower();
		// countRandomNumber.showData("Sort Data");

	}

}
