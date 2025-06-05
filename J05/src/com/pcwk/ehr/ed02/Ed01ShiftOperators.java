/**
 * 파일명:Ed01ShiftOperators.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed02;

public class Ed01ShiftOperators {

	public static void main(String[] args) {
		int x = 8;

		// 8을 좌시프트 2한 결과 :
		int leftshift = x << 2;
		System.out.printf("%d을 좌시프트 2한 결과: %d%n", x, leftshift);

		// 8을 우시프트 2한 결과 :
		int rightshift = x >> 2;
		System.out.printf("%d을 우시프트 2한 결과: %d%n", x, rightshift);

		// 8을 부호화 우시프트 2한 결과 :
		int signrightshift = x >>> 2;
		System.out.printf("%d을 부호화 우시프트 2한 결과: %d%n", x, signrightshift);

	}

}