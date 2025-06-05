/**
 * 파일명:Rectangle.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed02;

public final class Rectangle implements Shape {
	private double width;
	private double height;

	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

}
