/**
 * 파일명:Ex02.java <br/>
 * 생성일:2025-04-17
 */
package com.pcwk.ehr.ed02;

import java.util.Arrays;
import java.util.Collections;

public class Ex02 {

	public static void main(String[] args) {
		// 1 ~ 50사이 임이의 숫자 6개를 중복되지 않게 출력하는 자바 프로그램을 작성 하세요.
		// (단 배열로 소스를 작성하고, 내림차순(descending order)되게 출력 하세요.)

		// 1.1~50사이 난수
		final int NUMBER_COUNT = 50;
		Integer[] numbers = new Integer[NUMBER_COUNT];

		for (int i = 0; i < NUMBER_COUNT; i++) {
			numbers[i] = i + 1;
		}
		// System.out.println("numbers: " + Arrays.toString(numbers) + "\n");

		for (int j = 0; j <= NUMBER_COUNT; j++) {
			int num = (int) (Math.random() * 50) + 1;

			Integer tmpNum = numbers[0];
			numbers[0] = numbers[num];
			numbers[num] = tmpNum;

		}
		Integer[] pickNum = new Integer[6];
		for (int i = 0; i < 6; i++) {
			// System.out.print(numbers[i]+",");
			pickNum[i] = numbers[i];
		}

		Arrays.sort(pickNum, Collections.reverseOrder());

		for (int x : pickNum) {
			// System.out.print(x+",");
		}

		System.out.println("2번 답안: " + Arrays.toString(pickNum));
	}

}
