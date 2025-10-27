package practice;

public class Elephant extends Animal {// 建立一個class，名為Elephant並延伸自Animal類別
	private String name;// 此類別有一個成員變數為name(名字– 型別String)

	public Elephant() {
		super();
	}

	public Elephant(int age, float weight, String name) {// 此類別需宣告有參數的建構子
		super(age, weight);// 呼叫父類別建構子一定要放在第一個敘述
		this.name = name;
	}

	// JDK 5(1.5):Annotation(標註):給搭配的Java工具或框架看的資訊
	//讓編譯器對此方法的檢查是以override規則檢視,讓我們的操作在編譯階段就能先檢查語法規則
	@Override // 給編譯器看的
	public void speak() {// 有一覆寫成員方法名為speak()，用來印出父類別的兩個成員變數和自己的成員變數
		super.speak();// 呼叫父類別一般方法,沒有順序要求
//		System.out.println("我的名字是 " + name);
	}

//	此方法沒有改寫成功，但也不會有錯誤提示，因為被編譯器理解為overload（覆載）
	// 一個是父類別繼承到的speak()，一個是在子類別宣告的speak(int data)
	public void speak(int data) {
		super.speak();
	}

	public static void main(String[] args) {// 在main()裡透過建構子產生兩個物件

		Animal animal = new Animal(3, 8.0f);// 其一為Animal，其年紀和體重分別為3歲、8.0公斤
		System.out.println("=== Animal 資訊 ===");
		animal.speak();

		System.out.println();

		Elephant elephant = new Elephant(8, 1200.0f, "大象");// 另一為Elephant，其年紀、體重和種類名稱分別為8歲、1200.0公斤、大象
		System.out.println("=== Elephant 資訊 ===");
		elephant.speak();// 列印上述兩種Animal的值
	}
}
