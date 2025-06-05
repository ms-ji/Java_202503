/**
 * 파일명 : Ed05Example.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed02;

import java.util.Arrays;

public class Ed05Example {

	public static void main(String[] args) {
		// 배열에서 중복 값 제거 하기

		// - 입력 예시 : [1,2,3,2,4,5,1]
		// - 출력 예시 : [1,2,3,4,5]

		// 1. 배열 생성
		// 2. 배열 순회
		// 3. 중복 값이면 -> false

		int[] arr = { 1, 2, 3, 2, 4, 5, 1 }; // 입력 배열
		int[] uniqueArr = new int[arr.length]; // 중복값 제거하고 저장할 배열
		System.out.println(Arrays.toString(arr)); // 원본 배열의 데이터[1, 2, 3, 2, 4, 5, 1]
		System.out.println(Arrays.toString(uniqueArr)); // 초기화된 배열 데이터[0, 0, 0, 0, 0, 0, 0]

		int uniqueCount = 0;
		for (int i = 0; i < arr.length; i++) { // 배열 전체 순회
			boolean isDuplicate = false;

			for (int j = 0; j < uniqueCount; j++) { // 중복 제거된 배열 크기만큼 순회
				if (arr[i] == uniqueArr[j]) {
					isDuplicate = true;
					break;
				} // if end
			} // for j end

			if (!isDuplicate) {// 중복값이 아니면 증가
				uniqueArr[uniqueCount++] = arr[i];
			}
		} // for i end
		// 결과 출력
		System.out.println(Arrays.toString(uniqueArr));
		int[] result = new int[uniqueCount];

		System.arraycopy(uniqueArr, 0, result, 0, uniqueCount);
		System.out.println(Arrays.toString(result));
	}

}
