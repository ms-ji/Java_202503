/**
 * 파일명 : Main.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		Ed01toString person01 = new Ed01toString("이상무");
		
		System.out.println(person01.toString());
		//com.pcwk.ehr.ed01.Ed01toString@37a71e93
		
		Ed01toString person02 = new Ed01toString("이상무");
		System.out.println(person02.toString());
		//com.pcwk.ehr.ed01.Ed01toString@7e6cbb7a(패키지+클라스명+주소)
	}

}
