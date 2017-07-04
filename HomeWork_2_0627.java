package tw.larry.myproject.homeWork;
/*
 * 印出由'＊'所組成的三角形
 */
public class HomeWork_2_0627 {

	public static void main(String[] args) {
		float flag = 0;
		int row = 15, colum = 7, numberColum;
		int i = 1, j = 1;
		Double tmp;
		
		flag = row / 2 + 1; // 找中間數標籤	
		
		//System.out.println("flag="+flag);
		while (j <= colum) {
			i = 1;
			
			numberColum = j*2-1; //每列要顯示幾個
			tmp =  (double)(numberColum / 2); //左右位移數量
			//System.out.println("tmp="+tmp);
			//System.out.println("numberColum="+numberColum);
			while (i <= row) {
				
				if (i >= flag - tmp && i <= flag + tmp ) {
					System.out.print("* ");
				} else
					System.out.print(". ");
				i++;
			}
			System.out.println();
			j++;
		}
		
		j = 1;
		while (j <= colum) {
			i = 1;
			
			numberColum = j*2-1;
			tmp =  (double)(numberColum / 2);
			
			
			while (i <= row) {
				
				if (i >= flag - tmp && i <= flag + tmp ) {
					System.out.print("* ");
				} else
					System.out.print(". ");
				i++;
			}
			System.out.println();
			j++;
		}
		
		
	}

}
