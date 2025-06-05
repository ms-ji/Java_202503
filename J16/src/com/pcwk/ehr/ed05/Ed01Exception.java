/**
 * 파일명:Ed01Exception.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed05;

public class Ed01Exception {

	public static void main(String[] args) {

		try {
			System.out.println("1");
			int result = 10 / 0;

			System.out.println("2 result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("항상 실행 됩니다.");
		}
		System.out.println("3 프로그램 종료");

	}

}
