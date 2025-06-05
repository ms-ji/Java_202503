 /**
 * 파일명:Coffee.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ex03;

/**
 * 
 */
public class Coffee extends Beverage {

	@Override
	void brew() {
		System.out.println("커피를 내립니다.");
		
	}
	@Override
	void addCodiments() {
		System.out.println("설탕과 우유를 추가 합니다.");

	}


}
