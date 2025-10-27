package hw4;

import java.util.Scanner;

public class Homework4_19_Date {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.print("請輸入年份(yyyy)：");
		int year = scanner.nextInt();

		System.out.print("請輸入月份(mm)：");
		int month = scanner.nextInt();

		System.out.print("請輸入日期(dd)：");
		int day = scanner.nextInt();

		if (month < 1 || month > 12) {
			System.out.println("月份輸入錯誤！月份應該在 1-12 之間");
			scanner.close();
			return;
		}

		boolean isLeapYear = false;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			isLeapYear = true;
			daysInMonth[1] = 29;
		}

		if (day < 1 || day > daysInMonth[month - 1]) {
			System.out.println("日期輸入錯誤！該月份最多只有 " + daysInMonth[month - 1] + " 天");
			scanner.close();
			return;
		}

		int dayOfYear = 0;

		for (int i = 0; i < month - 1; i++) {
			dayOfYear += daysInMonth[i];
		}

		dayOfYear += day;

		System.out.println("輸入的日期為該年第 " + dayOfYear + " 天");

		if (isLeapYear) {
			System.out.println("(" + year + " 年是閏年)");
		}

		scanner.close();
	}
}
