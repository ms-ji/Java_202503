/**
 * 파일명 : Korean.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed25;

public class Korean {
	//필드 선언
		String nation = "대한민국";
		String name;
		String ssn; //주민등록번호
	

	//생선자 선언
	public Korean(String name,String ssn ) {
		this.name = name;
		this.ssn = ssn;
		//this 키워드 : 매개변수명과 필드명이 동일함으로 필드임을 구분하기 위해 사용
		
		
		
	}

}
