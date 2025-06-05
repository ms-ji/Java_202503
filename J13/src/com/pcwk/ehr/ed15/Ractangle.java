/**
 * 파일명 : Ractangle.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed15;

/**
 * 
 */
public class Ractangle extends Shape {

	double width;
	double height;

	public Ractangle(double width, double height) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	double calculateArea() {
		// 사각형의 넓이를 구하는 공식은 밑변과 높이를 곱하는 것입니다.
		// 즉, 넓이 = 밑변 × 높이입니다
		return height * width;
	}

}
