package hw7;

import java.io.*;

public class ReadFile {
	public static void main(String[] args) {
		String filePath = "/Users/javawork/Sample.txt";
		int i;

		try {

			File file = new File(filePath);
			long byteCount = file.length();

			int charCount = 0;
			int lineCount = 0;

			FileInputStream fis = new FileInputStream(filePath);
			BufferedInputStream bis = new BufferedInputStream(fis);

			while ((i = bis.read()) != -1) {
				char ch = (char) i;
				charCount++;

				if (ch == '\n') {
					lineCount++;
				}
			}

			bis.close();
			fis.close();

			System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料%n", byteCount, charCount, lineCount);

		} catch (IOException e) {
			System.err.println("讀取檔案時發生錯誤");
			e.printStackTrace();
		}
	}
}