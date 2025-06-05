/**
 * 파일명 : CarMain.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed22;

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
		
		//Car 객체의 필드값 읽기.
		System.out.println("모델명: "+myCar.model);
		System.out.println("시동여부: "+myCar.start);
		System.out.println("현재속도: "+myCar.speed);

	}

}
