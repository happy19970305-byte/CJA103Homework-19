package hw4;

public class Homework4_19_Planet {
	public static void main(String[] args) {
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		String vowels = "aeiou";

		int count = 0;

		for (int i = 0; i < planets.length; i++) {
			String planet = planets[i];
			System.out.print(planet + " 的母音：");

			for (int j = 0; j < planet.length(); j++) {
				char c = planet.charAt(j);

				if (vowels.indexOf(c) != -1) {
					System.out.print(c + " ");
					count++;
				}
			}
			System.out.println();
		}

		System.out.println("\n總共有 " + count + " 個母音");
	}
}
