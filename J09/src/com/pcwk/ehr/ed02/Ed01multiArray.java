/**
 * 파일명 : Ed01multiArray.java<br/>
 * 생성일 : 2025-03-28<br/>

 */
package com.pcwk.ehr.ed02;

public class Ed01multiArray {

	public static void main(String[] args) {
		int[][] scores = { { 100, 100, 100 }, { 20, 20, 20 }, { 50, 50, 50 }, { 70, 70, 70 } };

		// 행 요소 length
		System.out.println("행: " + scores.length);
		System.out.println("열: " + scores[0].length);

		for (int i = 0; i < scores.length; i++) {

			for (int j = 0; j < scores[0].length; j++) {
				System.out.printf("scores[%d][%d]=%3d", i, j, scores[i][j]);
			}
			System.out.println();
		}
		// 전체 합
		int sum = 0;

		// 향산된 for
		for (int[] score : scores) {
			for (int num : score) {
				sum += num;

			}
		}
		System.out.println("sum: " + sum);
	}

}
