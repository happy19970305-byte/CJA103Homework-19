package hw5;

import java.util.Scanner;

public class Rectangle {
    
    private int width;
    private int height;
    
    public void starSquare(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入寬與高：");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        
        rect.starSquare(width, height);
        
        scanner.close();
    }
}