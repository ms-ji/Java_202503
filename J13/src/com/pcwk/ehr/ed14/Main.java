/**
 * 파일명 : Main.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed14;

/**
 * 
 */
public class Main {

	public static void main(String[] args) {
		//추상 클래스는 객체 생성 불가
		//Animal ani = new Animal();
		Dog dog = new Dog();
		dog.makeSound();
		dog.sleep();
	}

}
