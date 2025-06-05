/**
 * 파일명 : Ed01SwitchExample.java<br/>
 * 생성일 : 2025-03-25<br/>
 */
package com.pcwk.ehr.ed99;

import java.util.Scanner;

public class Ed01SwitchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요.>");
		String grade = sc.next();
		
		int score = 0; 
		
		switch(grade) {
			case "A":
				score = 100;
				break;
			case "B":
				score =100-20;
				break;
			default:
				score = 60;
		}
		System.out.println("score: "+score);
		
		int score2 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100-20;
			yield result;
		}
		default ->60;
		};
		System.out.printf("score2: %d%n",score2);
	}

}
