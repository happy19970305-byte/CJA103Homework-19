//• 請分別建立x, y, z三個3x3的int陣列，然後把x和y陣列的加總存放
//到z陣列裡，
//再將結果顯示於螢幕上
//• x和y陣列中的數字：
//• 請用亂數產生介於0～30之間的整數
//• 亂數之取得可參考 java.lang.Math的靜態方法 random()
//• public static double random()
//．傳回亂數值其範圍為0.0～1.0
package hw1;

public class TestRandomArray1 {
	public static void main(String[] args) {

		// step1:建立3個3*3的二維陣列

		int x[][] = new int[3][3];
		int y[][] = new int[3][3];
		int z[][] = new int[3][3];

		// step2:將隨機亂數填入到x陣列

		System.out.println("x");

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = (int) (Math.random() * 31);
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// step3:將隨機亂數填數到ｙ陣列

		System.out.println("y");

		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				y[i][j] = (int) (Math.random() * 31);
				System.out.print(y[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// step4:將x,y對應位置的元素加總後，放到z陣列對應的位置

		System.out.println("z");
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
				System.out.print(z[i][j] + "\t");
			}
			System.out.println();
		}
		// step5:將3個陣列的元素列印顯示，觀察是否正確

	}
}