package hw4;

public class Homework4_19_Reverse {
	public static void main(String[] args) {
		String s = "Hello World";
		char[] charArray = s.toCharArray();
		String reversed2 = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed2 += charArray[i];
		}
		System.out.println("方法二結果：" + reversed2);
	}
}