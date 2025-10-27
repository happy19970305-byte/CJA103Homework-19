package hw4;

import java.util.Scanner;

public class Homework4_19_Borrow {
	public static void main(String[] args) {

		int[][] employees = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		Scanner scanner = new Scanner(System.in);

		System.out.print("小華想借多少錢？");
		int loanAmount = scanner.nextInt();

		int count = 0;
		String result = "";

		for (int i = 0; i < employees[0].length; i++) {
			int empId = employees[0][i];
			int cash = employees[1][i];

			if (cash >= loanAmount) {
				count++;
				result += empId + " ";
			}
		}

		if (count > 0) {
			System.out.println("有錢可借的員工編號: " + result + "共 " + count + " 人！");
		} else {
			System.out.println("沒有員工有足夠的錢可借！");
		}

		scanner.close();
	}
}
