package tw.larry.myproject.homeWork;

class poker {
	static int cards = 52;
	static int[] cardAry = new int[cards];

	public void toDeal(int cardsNeed, int players) {
		int dealCard = 0;
		if ((cardsNeed * players) > cards) {    // 控制每位玩家要獲得幾張牌,且要符合要的牌數小於等於總牌數
			System.out.println("To many asked!!");
		} else {
			for (int i = 0; i < players; i++) {   // 玩家數～要發幾次牌
				int count = 0;					  // 發牌次數壘加
				System.out.println("Playe " + (i + 1) + " cards:"); // i為0時代表1號玩家
				System.out.println("---------------------");
				while (true) {  //發牌嚕！ 

					if (count == cardsNeed)
						break; // 當發出去的牌等於需要的牌數,則停止

					dealCard = (int) (Math.random() * cards + 1);
					if (cardAry[dealCard - 1] == 0) {
						conversionToCardColor(dealCard);

						cardAry[dealCard - 1] = 1; // 發過的牌陣列內要標記為1, 代表發過了
						count++;				   // 壘加發牌次數
					}
				}
				System.out.println("---------------------");
			}
		}
	}

	private void conversionToCardColor(int number) { // 將random 到的1～52數字 轉換為
														// Club.Diamond.Heart.Spade
														// 印出
		float temp = 0;
		temp = ((float) number / 13);
		if (temp <= 1) {

			System.out.println("" + '\u2663' + number); // Club '\u2663'
		} else if (temp <= 2 && temp > 1) {

			System.out.println("" + '\u2666' + (number - 13)); // Diamond
																// '\u2666'
		} else if (temp <= 3 && temp > 2) {

			System.out.println("" + '\u2665' + (number - 26)); // Heart '\u2665'
		} else if (temp <= 4 && temp > 3) {

			System.out.println("" + '\u2660' + (number - 39)); // Spade '\u2660'
		}

	}

}

public class HomeWork_4_Poker_0630 {

	public static void main(String[] args) {
		poker dealer = new poker();         //建立一個poker類別的dealer物件, 分配記憶體位置
		dealer.toDeal(2, 2);                //toDeal(玩家,每位玩家需要的牌數)
		System.out.println("Go fight!!!");	//開戰啦！！！

	}

}
