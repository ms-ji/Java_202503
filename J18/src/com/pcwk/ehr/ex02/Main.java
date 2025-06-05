 /**
 * 파일명:Main.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ex02;

public class Main {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(4.3,5);
		Shape s01 = r;
		System.out.println("사각형의 넓이: "+s01.area());
		
		Circle c = new Circle(3);
		Shape c01 = c;
		System.out.println(c01.area());
	}

}
