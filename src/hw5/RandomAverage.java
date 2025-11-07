package hw5;

import java.util.Random;

public class RandomAverage {

    private int number;

    public void randAvg() {
        Random rand = new Random();
        int sum = 0;
        int[] numbers = new int[10];
        
        System.out.println("本次亂數結果：");
        
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(101);
            sum += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        
        int average = sum / 10;
        
        System.out.println();
        System.out.println(average);
    }

    public static void main(String[] args) {
        RandomAverage ra = new RandomAverage();
        ra.randAvg();
    }
}