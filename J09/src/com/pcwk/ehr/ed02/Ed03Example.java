/**
 * 파일명 : Ed03Example.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed02;

import java.util.Arrays;

public class Ed03Example {

	public static void main(String[] args) {
		// 1~45 숫자 중 중복되지 않게 6개 추출
		// 1. 1~45 배열 할당
		// 1.1 1~45 난수 : balls[0],balls[난수발생 숫자]
		// 2.Shuffle
		// 3. 6개 추출

		// 1. 1~45난수
		final int BALL_COUNT = 45;
		int[] balls = new int[BALL_COUNT];
		// System.out.printf("balls: "+Arrays.toString(balls));

		for (int i = 0; i < BALL_COUNT; i++) {
			balls[i] = i + 1;
		}
		System.out.printf("balls: " + Arrays.toString(balls) + "%n");

		for (int i = 0; i <= BALL_COUNT; i++) {
			int idx = (int) (Math.random() * 45) + 1;

			// System.out.print(idx+",");

			// balls[0]; //x
			// balls[idx]; //y
			// int tmpBall; //임시변수

			int tmpBall = balls[0];
			balls[0] = balls[idx];
			balls[idx] = tmpBall;
		}
		int[] pickBall = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.print(balls[i] + ",");
			pickBall[i] = balls[i];
		}
		System.out.println();
		// 정렬 AESC정렬
		bubbleSort(pickBall);

		// 정렬된 배열 출력
		System.out.println(Arrays.toString(pickBall));

	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {// 전체 반복

			for (int j = 0; j < arr.length - 1 - i; j++) { // 인접한 요소 비교
				if (arr[j] > arr[j + 1]) { // 앞의 값이 더 크면 자리 교환
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}

	}

}
