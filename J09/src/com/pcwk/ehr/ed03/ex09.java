/**
 * 파일명 : ex09.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed03;

public class ex09 {

	public static void main(String[] args) {
		//배열 변수 선언
		int []score;
		score = new int[] {83,90,87};
		
		//배열 항목의 총합 구하기
		int sum =0;
		for(int i =0;i<score.length;i++) {
			sum +=score[i];
		}
		System.out.println("총합은 "+sum);
		
		printsum(score);
	}
	
	//메소드 선언
	public static void printsum(int []score) {
		for(int i =0;i<score.length;i++) {
			System.out.printf("score[%d]: %d%n",i,score[i]);
		}
		
	}
	
}
