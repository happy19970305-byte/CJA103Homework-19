package practice;

public class AnimalTest {
//	• 在main()裡藉由建構子產生一個Animal，
//	同時初始化該物件的年紀和體重分別為2歲、5.0
//	公斤，並呼叫speak方法得到此Animal的成員變數值
	public static void main(String[] args) {
//		Animal Animal1 = new Animal(2, 5.0f);

//		Animal1.speak();
//		
//		System.out.println("===三年後===");
//		
//		Animal1.setAge(5);
//		Animal1.setWeight(25.0f);
//		Animal1.speak();
		
		Animal a1 = new Animal(3,8.0f);
		Elephant e1 = new Elephant(8,1200.0f,"大象");
		
		a1.speak();
		System.out.println("==================");
		e1.speak();
		
	}
}
