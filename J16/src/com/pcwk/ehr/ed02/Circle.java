/**
 * 파일명:Circle.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed02;

public final class Circle implements Shape {
	private double radius; //반지름
	
	
	/**
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double area() {
		return Math.PI*radius*radius;
	}

}
