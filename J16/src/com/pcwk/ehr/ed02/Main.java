/**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed02;

public class Main {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(4.3,5);
		Shape shape01 = r;
		System.out.println("사각형 넓이: "+shape01.area());
		System.out.println("===========================");
		
		Circle c = new Circle(10);
		Shape shape02 = c;
		System.out.println("원의 넓이: "+shape02.area());
	}

}
