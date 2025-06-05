/**
 * 파일명 : ex06.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed03;

public class ex06 {

	public static void main(String[] args) {
		String ssn ="880815-1234567";
		
		String firstName = ssn.substring(0,6);
		System.out.println(firstName);
		
		String secondName = ssn.substring(7);
		System.out.println(secondName);

	}

}
