/**
 * 파일명 : Animal.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed14;


public abstract class Animal {
	//추상 메서드(구현 없음)
	abstract void makeSound();
	
	//일반 메서드(구현 존재:{})
	void sleep () {
		System.out.println("목요일 동물이 잠을 잡니다.");
	}
}
