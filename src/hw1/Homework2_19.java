package hw1;

public class Homework2_19 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum1 = 0;
		int count1;
		for (count1 = 1; count1 <= 1000; count1++) {
			if (count1 % 2 == 0) {
				sum1 += count1;
			}
		}
		System.out.println(sum1);
//	}
//	• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int product1 = 1;
		int count5 ;
		for (count5 = 1; count5 <= 10; count5++) {
			product1 = product1 * count5;
		}
		System.out.println(product1);
//	• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int product2 = 1;
		int count3 = 1;
		while (count3 <= 10) {
			product2 = product2 * count3;
			count3++;
		}
		System.out.println(product2);
//	• 請設計一隻Java程式，輸出結果為以下：
//	1 4 9 16 25 36 49 64 81 100
		int square;
		for (square = 1; square <= 10; square++) {
			System.out.print(square * square + " ");
		}
//	• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//	輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int lottery;
		int count4 = 0;
		for (lottery = 1; lottery <= 49; lottery++) {
			if (lottery % 10 == 4 || lottery / 10 == 4) {
				continue;
			}
			System.out.print(lottery + " ");
			count4++;
		}
		System.out.println();
		System.out.println("總共有" + count4 + "個數字");
//	• 請設計一隻Java程式，輸出結果為以下：
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
		for (int i1 = 10; i1 >= 1; i1--) {
			for (int j1 = 1; j1 <= i1; j1++) {
				System.out.print(j1 + " ");
			}
			System.out.println();
		}
//	 請設計一隻Java程式，輸出結果為以下：
//	 A
//	 BB
//	 CCC
//	 DDDD
//	 EEEEE
//	 FFFFFF
		for (int i2 = 1; i2 <= 6; i2++) {
			int letter = 'A' + i2 - 1; 
			for (int j2 = 1; j2 <= i2; j2++) {
				System.out.print((char)letter);
			}
			System.out.println(); 
		}
	}
}