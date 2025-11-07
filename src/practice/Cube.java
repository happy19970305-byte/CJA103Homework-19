package practice;

//Cube設計者
public class Cube {
	private double length;// 先宣告屬性,再宣告建構子,再宣告方法

	public Cube() {// 宣告無參數建構子
	};

	public Cube(double length) throws CubeException {// 初始化邊長資料// 使用者把邊長傳進來,有參數建構子
		if (length > 0) {
			this.length = length;
		} else {
			throw new CubeException("正立方體邊長不得為0或是負數");// 參考PenGood.java
		}
	};

	public double getLength() {
		return length;
	}

	public void setLength(double length) {// 使用者把邊長傳進來
		this.length = length;
	}

	// 顯示體積
	public double getVolume() {
		return Math.pow(length, 3);
	}
}
