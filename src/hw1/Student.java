package hw1;

public class Student {
	int score = 90;
	int hours;

	//每休息一個小時，score就會減1
	public void play(int hours) {
		score -= hours;
	}

	//每讀書一個小時，score就會加1
	public void study(int hours) {
		score += hours;
	}

	//創建兩個學生物件，個別呼叫方法來模擬學生們的行為，最後再顯示兩位學生分數資料觀察是否正確
	
	public static void main(String[] args) {
		Student david = new Student();
		Student james = new Student();
		
		System.out.println(david.score);
		System.out.println(james.score);
		
		david.play(2);
		david.study(6);
		
		james.play(5);
		james.study(2);
		
		System.out.println("==========================================================");
		System.out.println(david.score);
		System.out.println(james.score);
		
	}
}
