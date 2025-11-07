package hw7;

import java.io.*;

public class DeserializeObjects {
	public static void main(String[] args) {
		String filePath = "/Users/Data/Object.ser";

		System.out.println("開始讀取物件並執行speak()方法:\n");

		try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis)) {

			Animal animal;
			int count = 1;

			while (true) {
				try {
					animal = (Animal) ois.readObject();
					System.out.print("物件 " + count + ": ");
					animal.speak();
					count++;
				} catch (EOFException e) {

					break;
				}
			}

			System.out.println("\n共讀取 " + (count - 1) + " 個物件");

		} catch (FileNotFoundException e) {
			System.out.println("找不到檔案: " + filePath);
		} catch (IOException e) {
			System.out.println("讀取檔案時發生錯誤: " + e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("找不到類別: " + e.getMessage());
			e.printStackTrace();
		}
	}
}