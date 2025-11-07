package hw5;

import java.security.SecureRandom;

public class CAPTCHA {
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final int CODE_LENGTH = 8;

	public static String genAuthCode() {
		SecureRandom random = new SecureRandom();
		StringBuilder authCode = new StringBuilder(CODE_LENGTH);

		for (int i = 0; i < CODE_LENGTH; i++) {
			int randomIndex = random.nextInt(CHARACTERS.length());
			authCode.append(CHARACTERS.charAt(randomIndex));
		}

		return authCode.toString();
	}

	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為：");
		System.out.println(genAuthCode());

	}
}