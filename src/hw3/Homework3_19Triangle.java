//		請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形，如圖示結果：
//		(提示：Scanner，三角形成立條件，判斷式if else)
//		(進階功能：加入直角三角形的判斷)
package hw3;

import java.util.Scanner;

public class Homework3_19Triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("請輸入三個整數：");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.println(a + " " + b + " " + c);

		if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {

			if (a == b && b == c) {
				System.out.println("正三角形");
			} else if (a == b || b == c || a == c) {

				if (isRightTriangle(a, b, c)) {
					System.out.println("等腰直角三角形");
				} else {
					System.out.println("等腰三角形");
				}
			} else {

				if (isRightTriangle(a, b, c)) {
					System.out.println("直角三角形");
				} else {
					System.out.println("其它三角形");
				}
			}
		} else {
			System.out.println("不是三角形");
		}

		scanner.close();
	}

	public static boolean isRightTriangle(int a, int b, int c) {

		return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
	}
}