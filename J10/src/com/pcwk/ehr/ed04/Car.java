/**
 * 파일명 : Car.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed04;

public class Car { 

		String model; //모델
		String color;//색상
		int year; //연식
		
	/**
	 * Default 생성자 입니다.
	 */
	public Car() {//Default 생성자 : 인스턴스/클래스 변수 초기화
		model = "미정";
		color = "white";
		year = 2025;
		
	}
	/**
	 * 인자 3개 생성자
	 * @param m
	 * @param c
	 * @param y
	 */
    public Car(String m, String c, int y) { //생성자 오버로딩
	    model = m;
	    color = c;
	    year = y;
    }
    	
	
	
	void displayInfo() {
		//모델:New Model Y 색상:Ultra Red 연식: 색상
		System.out.printf("모델: %s 색상: %s 연식: %d%n",model,color,year);
	}
}
