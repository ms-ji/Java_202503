/**
 * 파일명 : Ed04IfElseif.java<br/>
 * 생성일 : 2025-03-25<br/>
 */
package com.pcwk.ehr.ed03;

public class Ed04IfElseif {

	public static void main(String[] args) {
		double doubleNum = Math.random();
		System.out.printf("doubleNum: %.5f%n", doubleNum);
		
		// 주사위 돌리기 : 1~6사이 난수 발생
		int num = (int) (Math.random() * 6) + 1;

		System.out.printf("num: %d%n", num);


	}

}
