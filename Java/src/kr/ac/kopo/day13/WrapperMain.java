package kr.ac.kopo.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * wrapper class (기본자료형 8가지 -> 참조자료형)
 * 
 * 		boolean		Boolean
 * 		byte		Byte
 * 		char		Character
 * 		short		Short
 * 		int			Integer
 * 		long		Long
 * 		float		Float
 * 		double		Double
 * 
 * class Integer{
 * 		private int value;
 * }
 * 
 */

public class WrapperMain {
	
	public static void main(String[] args) {
		
		int i = 10;
		Integer i2 = new Integer(100);
		Integer i3 = 123; 					//이건 java1.5부터 가능  => auto boxing
		int i4 = new Integer(200); 			// auto unboxing
		
		System.out.println(i2);
		
//		List<Integer> list = new ArrayList<>();
//		list.add(new Integer(100));
//		list.add(new Integer(200));		
//		System.out.println(Arrays.toString(list.toArray()));
		
		String str = "19455";
		System.out.println(str + 100);
		
		int num = Integer.parseInt(str);		//기본자료형 반환 - 처음부터 기본자료형으로 받는게 더 빠르다
		System.out.println(num + 100);
		
		int num2 = Integer.valueOf(str);		//참조자료형 반환
		System.out.println(num2 + 100);
		
		
		
	}

}
