/**
 * 파일명:Beverage.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed03;

public abstract class Beverage {
	//음료 제조 순서
	void prepareRecipe() {
		boildWater(); //물 끓이기
		brew(); // 각 음료마다 다르게 구현
		pourinCup(); //컵에 따르기(공통)
		addCodiments();//토핑 - 각 음료마다 다르게 구현
	}
	
	
	//공통 메서드
	void boildWater() {
		System.out.println("물을 끓입니다.");
	}
	
	void pourinCup() {
		System.out.println("컵에 따릅니다.");
	}
	
	
	
	//커피와 티 클래스에서 구현하도록 강제.
	abstract void brew();
	abstract void addCodiments();
}
