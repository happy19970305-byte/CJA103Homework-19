package practice;

public class TestBMI {
	
	public static void main(String[] args){
		double weight = 48 , height = 1.6D;
		double bmi = weight / Math.pow(height,2);//算平方的函數，只要之後還要使用就要存變數，效率比較好
		
//		System.out.println( "BMI = " + (int)bmi );
		System.out.printf("BMI = %.2f%n" , bmi );
		
		if ( bmi < 18.5 ) {
			System.out.println("我過瘦了QQ");
		}
		else if ( bmi < 24 ) {
			System.out.println("體重還算正常啦");
		}
		else if ( bmi >= 24 ){
		System.out.println("我太胖了QQ");
		}
	}
}// f:formate格式轉換，printf:閱讀別人的程式碼，看範例
//(ln)line:換行 %n是換行
