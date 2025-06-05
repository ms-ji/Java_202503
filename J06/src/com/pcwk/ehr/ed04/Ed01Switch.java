/**
 * 파일명 : Ed01Switch.java<br/>
 * 생성일 : 2025-03-25<br/>
 */
package com.pcwk.ehr.ed04;

import java.util.Scanner;

public class Ed01Switch {

	public static void main(String[] args) {

		int score = 0; // 성적
		char grade = ' '; // 학점

		// 성적 입력
		Scanner sc = new Scanner(System.in);
		System.out.printf("성적을 입력 하세요>");
		score = sc.nextInt();

		System.out.printf("score=%d%n", score);

		switch (score / 10) {

		case 10:
		case 9:
			grade = 'A';
			break;

		case 8:
			grade = 'B';
			break;

		case 7:
			grade = 'C';
			break;

		case 6:
			grade = 'D';
			break;

		default:
			grade = 'F';
			break;

		}
		System.out.printf("학점은 %c%n", grade);

	}

}
