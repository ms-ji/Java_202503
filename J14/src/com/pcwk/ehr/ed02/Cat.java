package com.pcwk.ehr.ed02;

public class Cat extends Animal {

	public Cat() {
		//super();
		LOG.debug("Cat 생성자");
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		//super.sound();
		LOG.debug("고양이가 야옹야옹.");
	}

}
