package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void copyFile(String sourceFile, String destFile) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {

			fis = new FileInputStream(sourceFile);
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream(destFile);
			bos = new BufferedOutputStream(fos);

			byte[] buffer = new byte[1024];
			int bytesRead;

			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}

			System.out.println("檔案複製成功！");
			System.out.println("來源檔案: " + sourceFile);
			System.out.println("目的檔案: " + destFile);

		} catch (IOException e) {
			System.err.println("檔案複製時發生錯誤: " + e.getMessage());
		} finally {

			try {
				if (bos != null)
					bos.close();
				if (fos != null)
					fos.close();
				if (bis != null)
					bis.close();
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				System.err.println("關閉串流時發生錯誤: " + e.getMessage());
			}
		}
	}

	public static void main(String[] args) {

		String source = "/Users/javawork/OriginalFile.txt";
		String destination = "/Users/javawork/CopyFile.txt";

		copyFile(source, destination);

	}
}