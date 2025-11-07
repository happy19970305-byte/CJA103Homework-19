package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {

		MyRectangle rect1 = new MyRectangle();
		rect1.setWidth(10);
		rect1.setDepth(20);
		System.out.println("使用無參數建構子:");
		System.out.println("width: " + rect1.getWidth() + ", depth: " + rect1.getDepth());
		System.out.println("面積: " + rect1.getArea());
		System.out.println();

		MyRectangle rect2 = new MyRectangle(10, 20);
		System.out.println("使用帶參數建構子:");
		System.out.println("width: 10, depth: 20");
		System.out.println("面積: " + rect2.getArea());
	}
}