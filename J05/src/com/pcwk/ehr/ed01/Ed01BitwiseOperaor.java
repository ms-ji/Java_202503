/**
 * 파일명:Ed01BitwiseOperaor.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed01;

public class Ed01BitwiseOperaor {

	public static void main(String[] args) {
		int x = 42;
		String binaryString42 = Integer.toBinaryString(x);

		System.out.println("binaryString42: " + binaryString42);

		// 정수 52의 2진수 표현:
		System.out.printf("정수 %d의 2진수 표형 : %s %n", x, binaryString42);

		int y = 51;
		String BinaryString51 = Integer.toBinaryString(y);
		// 정수 51의 2진수 표현:
		System.out.printf("정수 %d의%n", y);
		System.out.printf("정수 %d의 2진수 표현 : %s %n", y, BinaryString51);

		// ANd(&)
		// 정수 42&51의 연산 결과 :
		System.out.printf("정수 %d & %d : %d%n", x, y, x & y);

		// OR(|)
		// 정수 42 | 51의 연산 결과 :
		System.out.printf("정수 %d | %d : %d%n", x, y, (x | y));

		// XOR(^)
		// 정수 42 ^ 51의 연산 결과 :
		System.out.printf("정수 %d ^ %d : %d%n", x, y, (x ^ y));

		// NOT(~)2의 보수 연산
		// 정수 ~ 42 연산 결과
		System.out.printf("정수 %d: %d%n", x, (~x));
		
		// NOT(~)2의 보수 연산
		// 정수 ~ 51 연산 결과
		System.out.printf("정수 %d: %d%n", y, (~y));
		
		
	}

}
