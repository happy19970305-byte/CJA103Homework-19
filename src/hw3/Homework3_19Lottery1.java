//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
//(提示：Scanner)
//(進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)
package hw3;

import java.util.Scanner;

public class Homework3_19Lottery1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("阿文...請輸入你討厭哪個數字？");
		int dislikedDigit = scanner.nextInt();

		if (dislikedDigit < 1 || dislikedDigit > 9) {
			System.out.println("請輸入1~9之間的數字！");
			scanner.close();
			return;
		}

		int count = 0;
		System.out.println();

		for (int i = 1; i <= 49; i++) {
			if (!containsDigit(i, dislikedDigit)) {
				System.out.print(i + "\t");
				count++;

				if (count % 7 == 0) {
					System.out.println();
				}
			}
		}

		System.out.println("\n總共有" + count + "數字可選");

		scanner.close();
	}

	private static boolean containsDigit(int number, int digit) {
		while (number > 0) {
			if (number % 10 == digit) {
				return true;
			}
			number /= 10;
		}
		return false;
	}
}