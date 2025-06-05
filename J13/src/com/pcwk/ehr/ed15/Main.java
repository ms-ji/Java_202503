/**
 * 파일명 : Main.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed15;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle(10);

		System.out.println("Circle 넓이: " + circle.calculateArea());

		Ractangle r = new Ractangle(6, 4);
		System.out.println("사각현의 넓이: " + r.calculateArea());
	}

}
