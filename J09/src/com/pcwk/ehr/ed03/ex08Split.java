/**
 * 파일명 : ex08Split.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed03;

public class ex08Split {

	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

		// 문자열 분리
		String[] tokens = board.split(",");// 쉼표 기준으로 분리

		System.out.println("번호 : " + tokens[0]);
		System.out.println("과목 : " + tokens[1]);
		System.out.println("내용 : " + tokens[2]);
		System.out.println("성명 : " + tokens[3]);

		// for문을 이용해 읽기
		for (int i = 0; i < tokens.length; i++) {
			System.out.printf("tokens[%d]=%s%n", i, tokens[i]);

		}

	}

}
