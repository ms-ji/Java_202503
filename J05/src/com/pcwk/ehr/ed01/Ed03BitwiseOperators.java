/**
 * 파일명:Ed03BitwiseOperators.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed01;

public class Ed03BitwiseOperators {

	public static void main(String[] args) {
		// 짝수, 홀수 판별법
		int num = 7;

		if ((num & 1) == 0) {
			// 7은 짝수 입니다.
			System.out.printf("%d는 짝수 입니다.", num);

		} else {
			System.out.printf("%d는 홀수 입니다.", num);
		}

	}

}
