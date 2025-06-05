/**
 * 파일명:Ed04.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed06;

public class Ed04 {

	public static void main(String[] args) {
		int value = 356;
		//10자리 이하는 버리는 코드
		System.out.println(value/100*100);
		
		System.out.println(value-(value%300));
		
	}

}
