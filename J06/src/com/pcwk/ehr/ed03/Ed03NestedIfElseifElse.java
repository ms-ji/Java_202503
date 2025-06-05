/**
 * 파일명 : Ed03NestedIfElseifElse.java<br/>
 * 생성일 : 2025-03-25<br/>
 */
package com.pcwk.ehr.ed03;

import java.util.Scanner;

public class Ed03NestedIfElseifElse {

	public static void main(String[] args) {

		// 변수
		int score = 0; // 성적
		char grade = ' '; // 학점
		char plus = ' '; // +

		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력 하세요>");

		score = sc.nextInt();
		System.out.printf("score=%d%n",score);
		
		if(score>=90) {
			grade ='A';
			
			if(score>=95) {
				plus ='+';
			}else {
				plus = ' ';
			}
		}else if(score>=80) {
			grade='B';
			
			if(score>=85) {
				plus ='+';
			}else {
				plus = ' ';
			}
		}else if(score>=70) {
			grade='C';
			
			if(score>=75) {
				plus ='+';
			}else {
				plus = ' ';
			}
		}else if(score>=60) {
			grade='D';
			
			if(score>=65) {
				plus ='+';
			}else {
				plus = ' ';
			}
		} else {
			grade = 'F';
		}
		System.out.printf("학점:%c%c",grade,plus);
		
		
	}

}
