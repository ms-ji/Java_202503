/**
 * 파일명:Dog.java<br/>
 * 생성일:2025-04-04
 */
package com.pcwk.ehr.ed13;


public class Dog extends Animal {

	/**
	 * @param name
	 */
	public Dog(String name) {
		super(name);
		
	}
	public void makeSound() {
		System.out.println(name+" 멍멍 !");
	}
}
