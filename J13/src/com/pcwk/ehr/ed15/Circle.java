/**
 * 파일명 : Circle.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed15;

public class Circle extends Shape {
	
	double radies;
	
	public Circle(double radies) {
		this.radies = radies;
	}
	
	@Override
	double calculateArea() {
		//원의 넓이 공식은 원의 반지름의 제곱에 원주율(π)을 곱한 값입니다. 
		//즉, 원의 넓이 = 반지름 × 반지름 × 원주율(π)입니다. 
		return Math.PI*radies*radies;
	}

}
