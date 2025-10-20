package hw1;

public class Homework1_19 {
	public static void main(String[] args) {
//	• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int num1 = 12;
		int num2 = 6;
		System.out.println("12+6=" + (num1 + num2));
		System.out.println("12*6="+(num1 * num2));
//	• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int eggNumber = 200;
		System.out.println("200顆蛋=" + eggNumber / 12 + "打" + eggNumber % 12 + "顆");
//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int time = 256559;
		System.out.println("256559秒=" + time / 60 / 60 / 24 + "天" + (time / 60 / 60) % 24 + "小時" + time / 60 % 60 + "分"
				+ time % 60 + "秒");
//	• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		double radius = 5;
		System.out.println("圓面積=" + (radius * radius * PI));
		System.out.println("圓周長=" + (radius * 2 * PI));
//	• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，
//	本金加利息共有多少錢 (用複利計算，公式請自行google)
		int money = 1500000;
		double rate = 0.02;
		int installment = 10;
		System.out.println((int)(money * (Math.pow((1 + rate), installment))));
//	• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因
		System.out.println(5+5);//原因：整數與整數相加，結果為整數
		System.out.println(5+'5');//原因：整數與字元相加，字元對應編碼表轉換後與5相加，結果為整數
		System.out.println(5+"5");//原因：整數與字串串接，結果為字串
	}
}
