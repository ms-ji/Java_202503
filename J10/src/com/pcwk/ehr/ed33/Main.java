/**
 * 파일명 : Main.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed33;

public class Main {

	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567","김자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);

		//k1.ssn = 123-12-1234; 상수값 변경 불가
		k1.name = "박자바";
				
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);

	}

}
