/**
 * 파일명 : Ex01.java<br/>
 * 생성일 : 2025-03-27<br/>
 */
package com.pcwk.ehr.ex;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// - 문제 설명 : 주어진 배열에서 짝수와 홀수를 각각 다른 배열에 저장한 후, 두 배열을 출력하세요.
		// - 입력 예시 : [5,8,2,1,9,6]
		// - 출력 예시
		// - 짝수: [8,2,6]
		// - 홀수: [5,1,9]

		int[] arr = { 5, 8, 2, 1, 9, 6 };

		// 홀수 배열
		int[] odd = new int[arr.length];

		// 짝수 배열
		int[] even = new int[arr.length];

		// 배열에 들어 있는 [내용]을 출력
		System.out.println("arr:" + Arrays.toString(arr));
		System.out.println("arr:" + Arrays.toString(odd)); //홀수 초기값
		System.out.println("arr:" + Arrays.toString(even)); //짝수 초기값
		System.out.println("-------------------------------");

		int evenCounter = 0; //짝수 값 수
		int oddCounter = 0; //홀수 값 수
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			// 짝수 홀수 나누는 로직
			if (num % 2 == 0) {
				even[evenCounter++] = num;
			} else {
				odd[oddCounter++] = num;
			}
		} // for end
		System.out.println("evenCounter: " + evenCounter);
		System.out.println("oddCounter: " + oddCounter);
		// 결과 출력
		// [8, 2, 6, 0, 0, 0] -> [8, 2, 6]
		//1. 새로운 변수 선언
		int[] evencp = new int[evenCounter];
		int[] oddcp = new int[oddCounter];
		
		//2. cp에 데이터 저장
		System.arraycopy(even, 0, evencp, 0, evenCounter);
		System.arraycopy(odd, 0, oddcp, 0, oddCounter);
		
		//3. 주소 번지 할당
		even = evencp;
		odd = oddcp;
		
		//4. 실행(내용 출력)
		System.out.println("== 실행 결과 ==");
		System.out.println("홀수 배열:" + Arrays.toString(odd));
		System.out.println("짝수 배열:" + Arrays.toString(even));

	} // main end

}
