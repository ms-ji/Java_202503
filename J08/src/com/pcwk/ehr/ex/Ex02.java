/**
 * 파일명 : Ex02.java<br/>
 * 생성일 : 2025-03-27<br/>
 */
package com.pcwk.ehr.ex;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// 최댓값 최솟값 구하기.

		// 1.배열을 전체 순회한다.
		// 2. 최댓값을 studscore[0]로 지정한다.
		// 3. 최댓값 변수 > studscore[i] -> 최댓값 변수 = studscore[i]

		int[] studscore = { 77, 66, 88, 99, 65, 98, 76, 85 };
		System.out.println("studscore: " + Arrays.toString(studscore));

		// 2.
		int max = studscore[0];
		int min = studscore[0];
		// 1.
		for (int i = 1; i < studscore.length; i++) {
			int num = studscore[i];
			// 3.
			if (max < num) { // 현재 최대값 보다 크면
				max = num; // 최대값을 더 큰 값으로 바꾼다.
				// System.out.println("max: "+max);
			} else if (min > num)
				min = num;
		}
		System.out.printf("최대값은 : %d, 최소값은 : %d 입니다.%n",max,min);
	}

}
