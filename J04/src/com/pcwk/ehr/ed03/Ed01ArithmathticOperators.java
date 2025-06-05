/**
 * 파일명: Ed01ArithmathticOperators.java<br/>
 * 생성일: 2025-03-21
 */
package com.pcwk.ehr.ed03;

public class Ed01ArithmathticOperators {

	public static void main(String[] args) {
		int a = 14;
		int b = 16;

		// 덧셈
		int sum = a + b;
		System.out.printf("%d + %d = %d%n", a, b, sum);

		// 뺄셈
		int difference = a - b;
		System.out.printf("%d - %d = %d%n", a, b, difference);

		// 곱셈
		int product = a * b;
		System.out.printf("%d * %d = %d%n", a, b, product);

		// 나눗셈 : int/int -> int
		a = 11;
		b = 2;

		System.out.printf("%d / %d = %d%n", a, b, a / b);

		float c = 2.0f;
		// int/float -> float/float -> float
		System.out.printf("%d / %d = %.2f%n", a, b, a / c);

		// 나머지 연산
		int remainder = a % b;
		System.out.printf("%d %% %d = %d%n", a, b, remainder);

	}

}
