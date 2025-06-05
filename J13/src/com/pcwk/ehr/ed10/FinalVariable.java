/**
 * 파일명 : FinalVariable.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed10;

public class FinalVariable {

	final int MAX_VALUE;// 상수 선언

	public FinalVariable() {
		MAX_VALUE = 100;
	}

	void display() {
		System.out.println("MAX_VALUE: " + MAX_VALUE);
	}

	public static void main(String[] args) {
		FinalVariable finalVariable = new FinalVariable();
		// finalVariable.MAX_VALUE = 200; 상수값 변경 불가
		finalVariable.display();
	}

}
