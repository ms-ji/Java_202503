/**
 * 파일명: IntegerLiteral.java <br/>
 * 작성자: user <br/>
 * 작성일: 2025-03-20 <br/>
 */
package com.pcwk.ehr.ed03;

/**
 * 
 */
public class IntegerLiteral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 10진수 : 일반적인 숫자 표현 (1,2,3,4,5,6,7,8,9,0)
		int decimalNumber = 9;
		System.out.println("decimalNumber: " + decimalNumber);

		// 2이진 : 0b 또는 0B 숫자 표현 (0,1)
		int b = 0b1010;
		System.out.println("b: " + b);

		// 8진수 : 0으로 시작 (1,2,3,4,5,6,7,0)
		int o = 012;
		System.out.println("o: " + o);

		// 8진수 : 0으로 시작 (1,2,3,4,5,6,7,0)
		int x = 0xA;
		System.out.println("x: " + x);

		// 정수 구분 :
		// 정수 리터럴의 Default 값은 : int
		// long 값의 경우 : 데이터 + L(l)
		long longNumber = 9_223_372_036_854_775_807L;
		System.out.println("longNumber: " + longNumber);
	}

}
