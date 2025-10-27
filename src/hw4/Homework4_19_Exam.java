package hw4;

public class Homework4_19_Exam {
		public static void main(String[] args) {

			int[][] scores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
					{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
					{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

			int[] highestCount = new int[8];

			for (int exam = 0; exam < scores.length; exam++) {

				int maxScore = scores[exam][0];
				for (int student = 1; student < scores[exam].length; student++) {
					if (scores[exam][student] > maxScore) {
						maxScore = scores[exam][student];
					}
				}

				System.out.print("第 " + (exam + 1) + " 次考試最高分 " + maxScore + " 分：");
				for (int student = 0; student < scores[exam].length; student++) {
					if (scores[exam][student] == maxScore) {
						highestCount[student]++;
						System.out.print((student + 1) + "號 ");
					}
				}
				System.out.println();
			}

			System.out.println("\n========== 統計結果 ==========");
			for (int i = 0; i < highestCount.length; i++) {
				System.out.println((i + 1) + "號同學考最高分次數：" + highestCount[i] + " 次");
			}

			int maxCount = highestCount[0];
			for (int i = 1; i < highestCount.length; i++) {
				if (highestCount[i] > maxCount) {
					maxCount = highestCount[i];
				}
			}

			System.out.println("\n考最高分次數最多的同學：");
			for (int i = 0; i < highestCount.length; i++) {
				if (highestCount[i] == maxCount) {
					System.out.println((i + 1) + "號同學，共 " + maxCount + " 次");
				}
			}
		}
	}

