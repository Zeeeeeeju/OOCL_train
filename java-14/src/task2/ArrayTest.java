package task2;

import java.util.Arrays;

public class ArrayTest {
	
	public static void main(String[] args) {
		String a[];
		String[] demoArray = {"a","b","c","d"};
		
		// 普通for遍历
		for(int i=0;i<demoArray.length;i++) {
			System.out.println(demoArray[i]);
		}
		
		// foreach遍历
		for(String o:demoArray) {
			System.out.println(o);
		}
		
		// Arrays工具类中toString静态方法遍历
		System.out.println(Arrays.toString(demoArray));
		
		// Lambda表达式遍历
		Arrays.asList(demoArray).forEach(item -> System.out.println(item));
		
	}
	
}
