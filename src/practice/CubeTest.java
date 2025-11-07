package practice;

//Cube使用者
public class CubeTest {
	public static void main(String[] args) {
		try {
			Cube c1 = new Cube(0);// 建立物件
			System.out.println(c1.getVolume());
			
			Cube c2 = new Cube();
			
		} catch (CubeException e) {
			e.printStackTrace();
		}

	}
}
