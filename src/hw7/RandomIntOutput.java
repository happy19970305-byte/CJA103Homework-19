package hw7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class RandomIntOutput {
	public static void main(String args[]) {
		try {

			FileOutputStream fos = new FileOutputStream("/Users/javawork/Data.txt", true);

			BufferedOutputStream bos = new BufferedOutputStream(fos);

			PrintStream ps = new PrintStream(bos);

			Random random = new Random();

			ps.println("=== 新的一次執行結果 ===");
			for (int i = 0; i < 10; i++) {
				int randomNumber = random.nextInt(1000) + 1;
				ps.println("第" + (i + 1) + "個數字: " + randomNumber);
			}
			ps.println();

			ps.close();
			bos.close();
			fos.close();

			System.out.println("已成功將10個隨機數字寫入 Data.txt 檔案！");

		} catch (IOException e) {
			System.err.println("發生錯誤: " + e);
		}
	}
}