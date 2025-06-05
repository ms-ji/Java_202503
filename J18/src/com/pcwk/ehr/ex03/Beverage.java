package com.pcwk.ehr.ex03;

public abstract class Beverage {
	
	//음료 제조 순서 -> 일반 메서드
	void prepareRecipe() {
		boildWater();
		brew();
		pourInCup();
		addCodiments();
	}
	
	
	//공통메서드 -> 일반 메서드
	void boildWater() {
		System.out.println("물을 끓입니다.");
	}
	void pourInCup() {
		System.out.println("컵에 따릅니다.");
	}
	
	//구체적인 사항 -> 추상 메서드
	abstract void brew(); //추출하다.
	abstract void addCodiments(); //토핑
	
	
}
