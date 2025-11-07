package hw7;

import java.io.*;

public class OutputDogCatObject {
	public static void main(String[] args) {

		String dirPath = "/Users/Data";
		String filePath = dirPath + "/Object.ser";
		
		File directory = new File(dirPath);
		if (!directory.exists()) {
			if (directory.mkdirs()) {
				System.out.println("資料夾已建立: " + dirPath);
			} else {
				System.out.println("資料夾建立失敗");
				return;
			}
		}
		
		Dog dog1 = new Dog("Lucky");
		Dog dog2 = new Dog("Max");
		Cat cat1 = new Cat("Kitty");
		Cat cat2 = new Cat("LittleWu");

		try (FileOutputStream fos = new FileOutputStream(filePath);
		     ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(dog1);
			oos.writeObject(dog2);

			oos.writeObject(cat1);
			oos.writeObject(cat2);
			
			System.out.println("物件已成功寫入: " + filePath);
			System.out.println("已寫入:");
			System.out.println("- 2個Dog物件");
			System.out.println("- 2個Cat物件");
			
		} catch (IOException e) {
			System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
			e.printStackTrace();
		}
	}
}