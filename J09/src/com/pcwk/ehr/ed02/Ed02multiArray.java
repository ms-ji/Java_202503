/**
 * 파일명 : Ed01multiArray.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed02;

public class Ed02multiArray {

	public static void main(String[] args) {
		int[][] scores = { { 100, 100, 100 }, { 20, 20, 20 }, { 50, 50, 50 }, { 70, 70, 70 } };

		// 행 요소 length
		System.out.println("행: " + scores.length);
		System.out.println("열: " + scores[0].length);

		int javaTotal = 0; // 자바 총점
		int oracleTotal = 0; // 오라클 총점
		int springTotal = 0; // 스프링 총점

		// header
		System.out.println("───────────────────────────────────────────────");
		System.out.println("번호    자바    오라클    스프링     총점     평균");
		System.out.println("───────────────────────────────────────────────");

		for (int i = 0; i < scores.length; i++) {
			int subTotal = 0; // 개인별 총점
			double subAvg = 0.0d;// 개인별 평균

			javaTotal += scores[i][0];
			oracleTotal += scores[i][1];
			springTotal += scores[i][2];

			System.out.printf("%2d", i + 1); // 번호

			for (int j = 0; j < scores[0].length; j++) {
				subTotal += scores[i][j];
				System.out.printf("%8d", scores[i][j]);
			}
			subAvg = subTotal / (scores[0].length * 1.0);
			System.out.printf("%8d %7.1f", subTotal, subAvg);

			System.out.println();
		}
		int s = javaTotal + oracleTotal + springTotal;
		System.out.println("───────────────────────────────────────────────");
		System.out.printf("총점: %5d %7d %7d %7d %7.1f", javaTotal, oracleTotal, springTotal, s, s / 3.0);
	}

}
