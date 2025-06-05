/**
 * 파일명 : Car.java<br/>
 * 생성일 : 2025-04-01<br/>
 */
package com.pcwk.ehr.ed31;

public class Car {

	//필드 선언
	String model;
	int speed;
	
	//생성자 선언
	Car(String model) {
		this.model = model;
	}
	//메서드 선언
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		this.setSpeed(100); //this 생략 가능
		System.out.println(this.model+"가 달립니다.(시속: "+this.speed+"km/h)");
	}
}
