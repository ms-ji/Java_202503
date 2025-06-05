package com.pcwk.ehr.ed05;

public class Child extends Parant {

	@Override
	public void show() {
		System.out.println("자식 클래스의 show() 메서드");
	}

	public void childMethod() {
		System.out.println("자식 클래스 고유의 메서드");
	}
}
