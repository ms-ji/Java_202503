/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ex04;

public class Main {

	public static void main(String[] args) {
		Inner i = new Inner();
		Inner.Innerinner newI = i.new Innerinner();
		
		newI.display();
	}

}
