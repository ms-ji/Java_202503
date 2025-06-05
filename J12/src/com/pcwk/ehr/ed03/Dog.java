/**
 * 파일명 : Dog.java<br/>
 * 생성일 : 2025-04-02
 */
package com.pcwk.ehr.ed03;

//자식 클래스(Dog) - Animal을 상속
public class Dog extends Animal {
	void bark() {
		System.out.println(name+ " 이(가) 멍멍 짖습니다.");
	}
}
