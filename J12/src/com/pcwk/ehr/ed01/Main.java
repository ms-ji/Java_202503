/**
 * 파일명 : Main.java<br/>
 * 생성일 : 2025-04-02
 */
package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		Child child = new Child();
		child.name = "이상무"; //부모 클래스의 속성
		child.showName(); //부모 클래스의 메서드
		
		child.age = 23; //자식 클래스의 속성
		child.showAge(); //자식 클래스의 메서드
	}

}
