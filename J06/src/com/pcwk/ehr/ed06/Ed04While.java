/**
 * 파일명 : Ed04While.java<br/>
 * 생성일 : 2025-03-25<br/>
 */
package com.pcwk.ehr.ed06;

public class Ed04While {

	public static void main(String[] args) {
		int number = 12345;
		int sum = 0;
		// System.out.println(number%10);
		// System.out.println(number/10);

		while (0 != number) {

			// 끝자리 추출하기
			int extNumber = number % 10;
			System.out.printf("number:%d,extNumber=%d%n", number, extNumber);

			sum += extNumber;
			number = number / 10;

		} // while end
		System.out.printf("%d의 각자리 총합:%d%n", 12345, sum);

	}// mail end

}
