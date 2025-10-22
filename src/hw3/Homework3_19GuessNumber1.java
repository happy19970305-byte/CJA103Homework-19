//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
package hw3;

import java.util.Scanner;
import java.util.Random;

public class Homework3_19GuessNumber1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int answer = random.nextInt(10);

		System.out.println("開始猜數字吧！");

		while (true) {
			int guess = scanner.nextInt();

			if (guess == answer) {

				System.out.println(guess);
				System.out.println("答對了！答案就是 " + answer);
				break;
			} else {

				System.out.println(guess);
				System.out.println("猜錯囉");
			}
		}

		scanner.close();
	}
}