/**
 * 파일명:Ed05Throw.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed05;

public class Ed05Throw {

	public static void main(String[] args) {
		int age = 16;

		try {
			if (age < 18) {

				throw new IllegalArgumentException("18세 이하는 구매할 수 없습니다.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException: " + e.getMessage());
		}
		System.out.printf("나이는 %d살 입니다.%n", age);
	}

}
