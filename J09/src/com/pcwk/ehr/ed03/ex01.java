/**
 * 파일명 : ex01.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed03;

public class ex01 {

	public static void main(String[] args) {
		//배열 선언
		int []arr1;
		int []arr2;
		int []arr3;
		
		//배열 생성과 변수 대입
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr1==arr2); //false 변수에 대입되는 번지가 다름.
		System.out.println(arr1.equals(arr2));//false 변수에 대입되는 번지가 다름.
		System.out.println(arr3==arr2); //true
		
		
	}

}
