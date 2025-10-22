package practice;

public class PolyAnimal {
	public static void main(String[] args) {
		Animal animal1 = new Animal(3, 8.0f);
        Animal animal2 = new Elephant(8, 1200.0f, "大象");
        System.out.println("=== Animal 資訊 ===");
        animal1.speak();
        
        System.out.println();
        System.out.println("=== Elephant 資訊 ===");
        animal2.speak();
	}
}