package practice;

public class Elephant extends Animal{
	String name;
	public Elephant(int age, float weight, String name) {
        super(age, weight);  // 呼叫父類別 Animal 的建構子
        this.name = name;
    }
	
	public void speak() {
        System.out.println("我的年紀是 " + age + " 歲");
        System.out.println("我的體重是 " + weight + " 公斤");
        System.out.println("我的名字是 " + name);
    }
	
	public static void main(String[] args) {
        // 建立 Animal 物件
        Animal animal = new Animal(3, 8.0f);
        System.out.println("=== Animal 資訊 ===");
        animal.speak();
        
        System.out.println(); // 空行
        
        // 建立 Elephant 物件
        Elephant elephant = new Elephant(8, 1200.0f, "大象");
        System.out.println("=== Elephant 資訊 ===");
        elephant.speak();
    }
}
