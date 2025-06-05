/**
 * 파일명 : ex05.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed03;

public class ex05 {

	public static void main(String[] args) {
		String ssn = "9506241230123";
		int length = ssn.length();

		if (length == 13) {
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}
	}

}
