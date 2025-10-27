//	• 有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示：陣列，length屬性)
package hw4;

public class Homework4_19_AVG {
	public static void main(String[] args) {
		int[] numbers = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}

		double average = (double) sum / numbers.length;

		System.out.println("陣列元素：");
		System.out.print("{");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if (i < numbers.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println("\n平均值：" + average);

		System.out.println("\n大於平均值的元素：");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > average) {
				System.out.print(numbers[i]+" ");
			}
		}
	}
}
