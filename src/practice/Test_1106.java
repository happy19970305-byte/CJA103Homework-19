//臨時起意的課堂練習：
//每次執行都從1~49之間顯示六個不重複的數字
package practice;

import java.util.HashSet;//快捷鍵自動完成
import java.util.Iterator;
import java.util.Set;//不要誤用了，運用元素的時候重複會被擋

public class Test_1106 {
	public static void main(String[] args) {
		Set set = new HashSet();// 好習慣，用父類別或父介面來代表子類別或實作介面

		// 產生 6 個不重複的數字（1~49）

//		for (int i = 1; i <= 6; i++) {//不推薦用for迴圈，因為次數不重要，不要去數跑幾次
//			int r1 = (int) (Math.random() * 49) + 1;
//			set.add(r1);
//		}

		while (set.size() != 6) {//
			int num = (int) (Math.random() * 49) + 1;
			set.add(num);
		}

		System.out.print("隨機數字： ");

		// 用迭代器顯示
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}