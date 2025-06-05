/**
 * 파일명 : Computer.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed29;

public class Computer {
	//가변길이 매개변수 메서드 선언
	int sum(int...values) {
		int sum = 0;
		
		for(int i:values) {
			sum += i;
		}
		return sum;
	}	
	
}
