package hw1;

public class Test4Numbers_19 {
	public static void main(String[] args) {
//		 請建立一個Test4Numbers.java，可輸出0～100裡4的倍數
		int i, j;
		for (i = 0; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.print(i + " ");
			}

		}

		System.out.print("\n");
		System.out.println();

		for (j = 0; j <= 100; j += 4) {
			System.out.print(j + " ");
		}

	}
}

//先判斷是不是四的倍數