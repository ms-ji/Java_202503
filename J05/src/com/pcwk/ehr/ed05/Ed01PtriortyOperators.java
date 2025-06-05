/**
 * 파일명:Ed01PtriortyOperators.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed05;

public class Ed01PtriortyOperators {

	public static void main(String[] args) {
		int result = 5 + 3 * 2;
		System.out.println("5 + 3 * 2: " + result); // 11

		// 괄호()로 우선순위 변경
		result = (5 + 3) * 2;
		System.out.println("(5+3)*2: " + result); // 16

		// 증감 연산자의 전위와 후위
		int a = 5;
		System.out.println(a++); // 5
		System.out.println(++a); // 7

		// 논리 연산자 와 비교 연산자
		int x = 10;
		int y = 20;

		boolean resultValue = x < y && y < 15;
		// true
		System.out.println(resultValue);
		
		//결합 방향 
		x = 10;
		x = y = 5;
		System.out.println("x: "+x);
		System.out.println("x: "+y);
		
		
	}

}
