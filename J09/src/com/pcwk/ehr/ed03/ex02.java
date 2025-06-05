/**
 * 파일명 : ex02.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed03;

public class ex02 {

	public static void main(String[] args) {
		// NullPointException
		// 변수가 null인 상태에서 객체 데이터나 메소드를 사용하려 할 때 예외 발생
		
		int[]intArray = null;
		intArray[0]=10; //NullPointerException
		
		String str = null;
		//System.out.println("총 문자 수: "+str.length());//NullPointerException
	}

}
