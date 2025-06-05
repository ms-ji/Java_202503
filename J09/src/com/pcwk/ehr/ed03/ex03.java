/**
 * 파일명 : ex03.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed03;

public class ex03 {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듦.

		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null; // kind2가 참조하고 있기 때문에 쓰레기 아님.

		System.out.println("kind2: " + kind2);
		// System.out.println("kind1: "+kind1); //null

	}

}
