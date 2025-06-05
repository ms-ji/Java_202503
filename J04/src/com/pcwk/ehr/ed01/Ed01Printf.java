package com.pcwk.ehr.ed01;

public class Ed01Printf {

	public static void main(String[] args) {
		
		int _num = 14; // 정수 (default: int)
		final double $PI = 3.141_1592d; // 실수(default: double)
		String name = "영희";

		System.out.printf("나이는: %d살, 원주율: %.5f, 이름: %s%n", _num, $PI, name);
		// \n,%n: line skip
		char grade = 'A';
		System.out.printf("성적: %c\n", grade);

		int hexValue = 10; // 10진수 10 -> 16진주로 출력
		System.out.printf("10진수: %d -> 16진수: %x,8진수: %o%n", hexValue, hexValue, hexValue);

		// 정수 출력(패딩): 5개 자리 확보, 빈자리는 0으로 채움.(오른쪽 정렬)
		System.out.printf("패딩: %05d%n", 23);// %5d - 5개 자리를 확보하세요.

		// 문자열 왼쪽 정렬(-자리수)
		String fruit = "apple";
		float price = 200.5f;

		System.out.printf("좌측 정렬: %-10s,가격은: %6.2f", fruit, price);

	}

}
