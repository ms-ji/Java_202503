/**
 * 파일명 : Ed01Array.java<br/>
 * 생성일 : 2025-03-27<br/>
 */
package com.pcwk.ehr.ed01;

public class Ed01Array {

	public static void main(String[] args) {

		// int []ages; //변수 선언
		// ages = new int[5];//변수 초기화

		// 1. 변수 선언과 생성
		int[] ages = new int[5];

		ages[0] = 14; // 첫 번째 요소에 값을 할당
		ages[1] = 16; // 두 번째 요소에 값을 할당
		// 2. 배열의 크기 확인(길이 : length)
		System.out.println("ages.length: " + ages.length);
		System.out.println("ages배열의 첫번쨰 요소 값: " + ages[0]);
		// 3. 배열의 요소 출력
		for (int i = 0; i < ages.length; i++) {
			System.out.printf("index: ages[%d]=%d%n", i, ages[i]);
		}

		System.out.println("====================================");

		// 4. 생성과 동시에 배열 선언과 초기화
		String[] fruits = { "딸기", "사과", "바나나" };

		// 5. 배열의 크기 확인
		System.out.println("fruits.length: " + fruits.length);
		System.out.println("fruits배열 두번쨰 요소값: " + fruits[1]);

	}

}
