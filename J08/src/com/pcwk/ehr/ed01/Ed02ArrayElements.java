/**
 * 파일명 : Ed02ArrayElements.java<br/>
 * 생성일 : 2025-03-27<br/>
 */
package com.pcwk.ehr.ed01;

public class Ed02ArrayElements {

	public static void main(String[] args) {
		// 배열의 크기가 5인 정수 배열 생성
		int[] numbers = new int[5];
		System.out.println("numbers: " + numbers);

		numbers[0] = 14;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		// java.lang.ArrayIndexOutOfBoundsException
		// Index 5 out of bounds for length 5
		// numbers[5] = 88;

		// 배열의 요소 값 출력
		System.out.println("배열 요소 첫 번째: " + numbers[0]);
		System.out.println("배열 요소 두 번째: " + numbers[1]);
		System.out.println("배열 요소 세 번째: " + numbers[2]);
		System.out.println("배열 요소 네 번째: " + numbers[3]);
		System.out.println("배열 요소 다섯 번째: " + numbers[4]);

		// 배열의 요소 값을 새로운 변수에 할당
		int newNumbers = numbers[0];
		System.out.println("newNumbers: " + newNumbers);
		System.out.println("----------------------");

		// 반복문 사용 배열 요소 접근
		for (int i = 0; i < numbers.length; i++) {
			System.out.printf("numbers[%d]=%d%n", i, numbers[i]);
		}
	}

}
