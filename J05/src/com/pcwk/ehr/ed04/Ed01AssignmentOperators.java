/**
 * 파일명:Ed01AssignmentOperators.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed04;

public class Ed01AssignmentOperators {

	public static void main(String[] args) {
		int x = 3; // 선언 및 초기화
		System.out.printf("원본 x = %d%n", x);
		System.out.printf("x+=3 => %d%n", (x += 3));

		x = 3; // 초기화

		System.out.printf("x*=3 => %d%n", (x *= 3));

		// 비트 연산 수행
		x = 5;
		System.out.printf("x&=3 => %d%n", (x &= 3));

		x = 5;
		System.out.printf("x<<=2 => %d%n", (x <<= 2));

	}

}
