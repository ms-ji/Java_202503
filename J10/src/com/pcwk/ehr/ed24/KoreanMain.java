/**
 * 파일명 : KoreanMain.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed24;

public class KoreanMain {

	public static void main(String[] args) {
		// 객체 생성
		Korean k1 = new Korean("박자바","011225-1234567");
		
		// 객체 데이터 읽기
		System.out.println("국가: "+k1.nation);
		System.out.println("이름: "+k1.name);
		System.out.println("주민등록번호: "+k1.ssn);
		System.out.println();
		
		//또 다른 객체 생성
		Korean k2 = new Korean("김자바","931225-1234567");
		
		System.out.println("국가: "+k2.nation);
		System.out.println("이름: "+k2.name);
		System.out.println("주민등록번호: "+k2.ssn);
	}

}
