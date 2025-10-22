package hw3;

import java.util.Scanner;
import java.util.Random;

public class Homework3_19GuessNumber2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int answer = random.nextInt(101);

		System.out.println("開始猜數字吧！（0~100）");

		while (true) {
			int guess = scanner.nextInt();

			if (guess == answer) {
				System.out.println(guess);
				System.out.println("答對了！答案就是 " + answer);
				break;
			} else if (guess > answer) {

				System.out.println(guess);
				System.out.println("猜錯囉（提示：太大了）");
			} else {

				System.out.println(guess);
				System.out.println("猜錯囉（提示：太小了）");
			}
		}

		scanner.close();
	}
}
