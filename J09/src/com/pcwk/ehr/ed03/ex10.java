/**
 * 파일명 : ex10.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed03;

public class ex10 {

	public static void main(String[] args) {
		int score[] = {84,90,96};
		
		int sum = 0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		System.out.println("sum: "+sum);
		
		//평균 구하기
		double avg = (double)sum/score.length;
		System.out.println("avg: "+avg);
	}

}
