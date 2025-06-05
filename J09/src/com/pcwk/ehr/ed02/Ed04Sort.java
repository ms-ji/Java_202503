/**
 * 파일명 : Ed04Sort.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed02;

import java.util.Arrays;

	public class Ed04Sort {
	
		public static void bubbleSort(int[]arr) {
			for (int i = 0; i < arr.length-1; i++) {// 전체 반복
				
				for (int j = 0; j < arr.length-1-i; j++) { // 인접한 요소 비교
					if (arr[j] > arr[j + 1]) { // 앞의 값이 더 크면 자리 교환
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
						
					}
					
				}
				
			}
		}
	public static void main(String[] args) {
		// [5,3,8,4,2]

		int[] arr = { 5, 3, 8, 4, 2 };
		System.out.println("정렬 전: "+Arrays.toString(arr));
		bubbleSort(arr);
		
		// 결과 출력
		for (int num : arr) {
			System.out.print(num + ",");
		}
	}
	
}
