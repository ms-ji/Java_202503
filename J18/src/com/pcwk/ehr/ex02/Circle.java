 /**
 * 파일명:Circle.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ex02;

/**
 * 
 */
public final class Circle implements Shape {
	private double radius;
	
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
