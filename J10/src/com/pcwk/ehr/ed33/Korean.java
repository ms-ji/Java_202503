/**
 * 파일명 : Korean.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed33;

public class Korean {
	//필드 선언
	final String nation = "대한민국";
	final String ssn;
	
	String name;
	
	//생성자 선언
	public Korean(String ssn,String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
