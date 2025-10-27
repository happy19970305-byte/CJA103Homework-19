//• 建立一個class，名為Animal.java
//• 此類別有兩個成員變數分別為age(年紀- 型別int)、weight(體重- 型別float)
//• 此類別需宣告有參數的建構子
//• 有一成員方法名為speak()，用以列印上述兩個值
//• 在main()裡藉由建構子產生一個Animal，同時初始化該物件的年紀和體重分別為2歲、5.0
//公斤，並呼叫speak方法得到此Animal的成員變數值
package practice;

public class Animal {
//	• 此類別有兩個成員變數分別為age(年紀- 型別int)、
//	weight(體重- 型別float)
	private int age;
	private float weight;

	// 把無參數建構子再宣告出來（保留著）
	public Animal() {
		//1.留著給子類別建構子的呼叫對應
		//2.無參數建構子也是"Java Bean"的規範要點之一
		//3.給搭配的框架使用（框架會呼叫此建構子幫我們產生物件）
	}

//	• 此類別需宣告有參數的建構子
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}

//	• 有一成員方法名為speak()，用以列印上述兩個值
	public void speak() {
		System.out.println("我的年紀是 " + this.age + " 歲");
		System.out.println("我的體重是 " + this.weight + " 公斤");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
