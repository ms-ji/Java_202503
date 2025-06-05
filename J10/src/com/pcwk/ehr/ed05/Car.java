/**
 * 파일명 : Car.java<br/>
 * 생성일 : 2025-03-31<br/>
 */
package com.pcwk.ehr.ed05;

/**
 * 생성자 체이닝
 */
public class Car {
	String model;
	String color;
	int year;

	/**
	 * default 생성자
	 */
	public Car() {
		this("Tesla New Model X", "Ultra Red", 2025);
	}
	/**
	 * model을 파라메타로 가지고 있는 생성자<br/>
	 * @param model
	 */
	public Car(String model) {
		// System.out.println("");
		this(model, "white", 2025);
	}

	/**
	 * 
	 * @param model
	 * @param color
	 * @param year
	 */
	public Car(String model, String color, int year) {
		// this : Car 자신
		this.model = model;
		this.color = color;
		this.year = year;
		System.out.println("모든 매개변수가 있는 생성자.");
	}

	void displayInfo() {
		// 모델:New Model Y 색상:Ultra Red 연식: 색상
		System.out.printf("모델: %s 색상: %s 연식: %d%n", model, color, year);
	}

}
