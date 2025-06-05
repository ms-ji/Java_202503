 /**
 * 파일명:Tee.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ex03;

/**
 * 
 */
public class Tee extends Beverage {

	@Override
	void brew() {
		System.out.println("차를 내린다.");

	}

	@Override
	void addCodiments() {
		System.out.println("레몬을 추가합니다.");
	}

}
