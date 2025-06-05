/**
 * 파일명 : CarMain.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed23;

/**
 * 
 */
public class CarMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		//객체의 필드값 읽기.
		System.out.println("제작 회사: "+myCar.compony);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고 속도: "+myCar.maxSpeed);
		System.out.println("현재 속도: "+myCar.speed);
		
		//객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);
	}

}
