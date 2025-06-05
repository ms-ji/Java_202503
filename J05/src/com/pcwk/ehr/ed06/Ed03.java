/**
 * 파일명:Ed03.java<br/>
 * 생성일:2025-03-24
 */
package com.pcwk.ehr.ed06;

public class Ed03 {

	public static void main(String[] args) {
		int pen = 534;
		int st =30;
		
		//학생 한명이 가지는 연필 수
		int penstudent = pen/st;
		System.out.println(penstudent); //17
		
		//남은 연필 수
		int penstudentLeft = pen%st;
		System.out.println(penstudentLeft); //24
		
	}

}
