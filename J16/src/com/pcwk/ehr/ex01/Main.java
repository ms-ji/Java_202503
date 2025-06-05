/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ex01;

public class Main {

	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

}
