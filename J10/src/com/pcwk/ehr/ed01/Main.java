/**
 * 파일명 : Main.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed01;

public class Main {

	public static void main(String[] args) {
		
		// 객체 생성
		Car myCar = new Car();

		// 필드 값 설정
		myCar.brand = "tesla";
		myCar.speed = 50;

		// 메소드 호출
		myCar.accelerate(); // tesla 속도: 60km/h
		myCar.brake(); // tesla 속도: 50km/h
	}

}
